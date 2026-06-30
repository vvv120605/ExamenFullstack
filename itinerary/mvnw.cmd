@echo off
setlocal
set MVNW_REPOURL=https://repo.maven.apache.org/maven2
if exist "%~dp0mvnw" (
  call "%~dp0mvnw"
) else (
  mvn %*
)
