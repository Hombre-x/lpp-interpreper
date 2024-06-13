Write-Output "Creating project..."

# Create variables
$ProjectPath = ".\build\export"

$SourcePath = "$ProjectPath\src"
$LibPath    = "$ProjectPath\lib"

$CommandSBT = "./gradlew shadowJar"

# Creates the output directories
mkdir $SourcePath, $LibPath -ErrorAction SilentlyContinue

# Invokes SBT to create the .jar file
Invoke-Expression $CommandSBT

# Copie the Scala code to the src directory
Copy-Item -Path "./src/main/kotlin" -Destination $SourcePath -Recurse -ErrorAction SilentlyContinue

# Copies the .jar file to the lib directory
Copy-Item -Path "./build/libs/kotlin-interpreter-0.1.jar" -Destination $LibPath

# Copies the Main.java file to the src directory
Copy-Item -Path "./src/main/java/Main.java" -Destination "$SourcePath/Main.java"

# Copies the grammar to the src directory
Copy-Item -Path "./grammar" -Destination "$SourcePath/grammar" -Recurse -ErrorAction SilentlyContinue

# Copies the README.md file to the src directory
Copy-Item -Path "./README.md" -Destination "$SourcePath/README.md"


# Creates the Lexer.zip project file
# Compress-Archive `
#   -Path "$SourcePath", "$LibPath" `
#   -DestinationPath "$ProjectPath/lexer_project.zip" `
#   -CompressionLevel "Optimal" `
#   -Force

# WinRAR a -afzip -m5 -ep1 "$ProjectPath\lexer_project.zip" "$SourcePath" "$LibPath"

# # Removes the temporary directories
# Remove-Item -Path $SourcePath, $LibPath -Recurse