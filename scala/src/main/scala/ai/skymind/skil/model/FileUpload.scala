/**
 * Predict
 * Endpoints API for classification and other prediction services in SKIL
 *
 * OpenAPI spec version: 1.1.0-beta
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package ai.skymind.skil.model


case class FileUpload (
  Key: Option[String] = None,
  FileName: Option[String] = None,
  Status: Option[String] = None,
  `Type`: Option[String] = None,
  `Path`: Option[String] = None,
  FileContent: Option[String] = None
)
