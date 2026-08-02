param([string]$ProjectRoot = (Get-Location).Path)
$ErrorActionPreference = "Stop"
$source = Join-Path $PSScriptRoot "VimaxOS-Genesis-Foundation"
Get-ChildItem -Path $source -Recurse -File | ForEach-Object {
  $relative = $_.FullName.Substring($source.Length).TrimStart('\')
  $destination = Join-Path $ProjectRoot $relative
  New-Item -ItemType Directory -Path (Split-Path $destination -Parent) -Force | Out-Null
  if (Test-Path $destination) { Copy-Item $destination "$destination.pre-genesis.bak" -Force }
  Copy-Item $_.FullName $destination -Force
  Write-Host "Создано: $relative" -ForegroundColor Green
}
Write-Host "Основание VIMAX.GENESIS установлено." -ForegroundColor Cyan
Write-Host "git status"
Write-Host "git add ."
Write-Host 'git commit -m "Establish VIMAX Genesis foundation"'
Write-Host "git push"
