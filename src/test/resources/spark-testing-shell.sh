export JOPTS=" -Dpipeline.conf=${HOME}/Documents/code/data-pipeline/src/test/resources/pipeline.conf"
$SPARK_HOME/bin/spark-shell \
--packages "com.typesafe:config:1.4.2,com.github.pureconfig:pureconfig_2.12:0.17.2" \
--driver-java-options="${JOPTS}" \
--conf "spark.executor.extraJavaOptions=${JOPTS}"