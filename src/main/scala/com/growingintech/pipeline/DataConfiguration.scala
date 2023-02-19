package com.growingintech.pipeline

import com.typesafe.config.{Config, ConfigFactory}

class DataConfiguration extends Serializable {

  val conf: Config = ConfigFactory.load(System.getProperty("config.pipeline"))
}
