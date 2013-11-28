@echo off
rem Runs a collection of VDM++ test examples
rem Assumes specification is in Word RTF files

set S1=Piece.rtf
set S2=TestPiece.rtf
set S3=Amazon.rtf
set S4=TestAmazon.rtf
set S5=Arrow.rtf
set S6=TestArrow.rtf
set S7=Board.rtf
set S8=TestBoard.rtf


"C:\Program Files\The VDM++ Toolbox v9.0.2\bin\vppde" -p -R vdm.tc %S1% %S2% %S3% %S4% %S5% %S6% %S7% %S8%
for /R %%f in (*.arg) do call vdmtest "%%f"
