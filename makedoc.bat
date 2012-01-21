::
:: Batch file for making the API HTML
::

:: Build up classpath
@set ORIG_CLASSPATH=%CLASSPATH%

:: @set SPECS2=D:\progra~1\Apache\m2\repository\org\specs2\specs2-scalaz-core_2.9.1\6.0.1\specs2-scalaz-core_2.9.1-6.0.1.jar
:: @set SPECS2=%SPECS2%;D:\progra~1\Apache\m2\repository\org\specs2\specs2_2.9.1\1.7.1\specs2_2.9.1-1.7.1.jar

:: @set CLASSPATH=%CLASSPATH%;%SPECS2%

@set PACKAGES=..\src\main\scala\com\keithpinson\docSample\*.scala
@set PACKAGES=%PACKAGES% ..\src\main\scala\com\keithpinson\docSample\subCode\*.scala


@md api
@cd api
call scaladoc.bat %PACKAGES%
::call scaladoc.bat -classpath %CLASSPATH% %PACKAGES%
:: call D:\src\ScalaProjects\scala-lang\scala-2.10.0-M1\bin\scaladoc.bat -classpath %CLASSPATH% %PACKAGES%

:: Copy jpg, png, and other such resources 
@xcopy /QEIY ..\doc-resources doc-resources
@cd ..


@set CLASSPATH=%ORIG_CLASSPATH%

@exit/b

