echo ========================
echo ========================
echo Building declaration.
echo ========================
echo ========================

call mvn -f uberPom.xml install

echo ========================
echo ========================
echo Building artifacts.
echo ========================
echo ========================

call mvn -e -DskipTests=true clean install

echo ========================
echo ========================
echo Running clean.
echo ========================
echo ========================

call mvn clean

echo ========================
echo ========================
echo Building xts-sdk.
echo ========================
echo ========================

call cd xts-rest-api\xts-sdk
call mvn install
call cd ..\..

echo ========================
echo ========================
echo Building api-tester.
echo ========================
echo ========================

call cd xts-rest-api\api-example
call mvn install
call cd ..\..

call copy setEnv.bat xts-rest-api\xts-sdk\target
call copy setEnv.bat xts-rest-api\api-example\target