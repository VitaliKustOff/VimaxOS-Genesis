param([string]$ProjectRoot = (Get-Location).Path)
$ErrorActionPreference = "Stop"
$source = Join-Path $PSScriptRoot "VimaxOS-Genesis-GDPoV-v0.1"
if (-not (Test-Path $source)) { throw "Package folder not found: $source" }
Get-ChildItem $source -Recurse -File | ForEach-Object {
  $relative = $_.FullName.Substring($source.Length).TrimStart('\')
  $target = Join-Path $ProjectRoot $relative
  $dir = Split-Path $target -Parent
  New-Item -ItemType Directory -Force -Path $dir | Out-Null
  if (Test-Path $target) { Copy-Item $target "$target.pre-gdpov.bak" -Force }
  Copy-Item $_.FullName $target -Force
  Write-Host "Created: $relative" -ForegroundColor Green
}
Write-Host "GDPoV 0.1 GEM installed." -ForegroundColor Cyan
Write-Host "git status"
Write-Host "git add ."
Write-Host 'git commit -m "Introduce GDPoV 0.1 GEM protocol"'
Write-Host "git push"
