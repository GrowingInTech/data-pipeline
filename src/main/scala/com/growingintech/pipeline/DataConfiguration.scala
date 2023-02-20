/*
 * Copyright 2023 GrowingInTech.com. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not
 * use this file except in compliance with the License. A copy of the License
 * is located at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * or in the "license" file accompanying this file. This file is distributed on
 * an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 *
 */
package com.growingintech.pipeline

import java.io.File

import com.typesafe.config.{Config, ConfigFactory}
import org.apache.logging.log4j.scala.Logging


class DataConfiguration extends Serializable with Logging {

  logger.info("Parsing application.conf")
  val conf: Config = ConfigFactory.parseFile(new File(System.getProperty("config.file")))
    .withFallback(ConfigFactory.parseFile(new File(System.getProperty("application.file"))))
    .resolve()
}
