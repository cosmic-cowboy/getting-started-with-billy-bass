#!/bin/sh
if [ $# -ne 1 ]; then
  echo "指定された引数は$#個です。" 1>&2
  echo "実行するには1個の引数(転送先のIP address)が必要です。" 1>&2
  exit 1
fi
mvn clean compile package
scp -v target/getting-started-with-billy-bass-0.0.1-SNAPSHOT-jar-with-dependencies.jar pi@$1:
ssh pi@$1 sudo java -jar getting-started-with-billy-bass-0.0.1-SNAPSHOT-jar-with-dependencies.jar
