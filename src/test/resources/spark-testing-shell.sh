export JOPTS=" -Dconfig.file=${HOME}/Desktop/pipeline-alt.conf -Dapplication.file=${HOME}/Desktop/application-alt.conf"
$SPARK_HOME/bin/spark-shell \
--packages "com.typesafe:config:1.4.2,com.github.pureconfig:pureconfig_2.12:0.17.2,com.growingintech:spark-input-sources_2.12:1.0.1" \
--driver-java-options="${JOPTS}" \
--conf "spark.executor.extraJavaOptions=${JOPTS}" \
--conf "spark.jars.ivy=${HOME}/dustin/.ivy2"