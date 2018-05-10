/**
 * Predict
 * Endpoints API for classification and other prediction services in SKIL
 *
 * OpenAPI spec version: 1.0.3
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package ai.skymind.skil

import java.text.SimpleDateFormat

import ai.skymind.skil.model.Base64NDArrayBody
import ai.skymind.skil.model.ClassificationResult
import java.io.File
import ai.skymind.skil.model.JsonArrayResponse
import ai.skymind.skil.model.LogBatch
import ai.skymind.skil.model.LogRequest
import ai.skymind.skil.model.ModelStatus
import ai.skymind.skil.model.MultiClassClassificationResult
import ai.skymind.skil.model.Prediction
import io.swagger.client.{ApiInvoker, ApiException}

import com.sun.jersey.multipart.FormDataMultiPart
import com.sun.jersey.multipart.file.FileDataBodyPart

import javax.ws.rs.core.MediaType

import java.io.File
import java.util.Date
import java.util.TimeZone

import scala.collection.mutable.HashMap

import com.wordnik.swagger.client._
import scala.concurrent.Future
import collection.mutable

import java.net.URI

import com.wordnik.swagger.client.ClientResponseReaders.Json4sFormatsReader._
import com.wordnik.swagger.client.RequestWriters.Json4sFormatsWriter._

import scala.concurrent.ExecutionContext.Implicits.global
import scala.concurrent._
import scala.concurrent.duration._
import scala.util.{Failure, Success, Try}

import org.json4s._

class DefaultApi(
  val defBasePath: String = "https://localhost:9008/endpoints",
  defApiInvoker: ApiInvoker = ApiInvoker
) {
  private lazy val dateTimeFormatter = {
    val formatter = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSZ")
    formatter.setTimeZone(TimeZone.getTimeZone("UTC"))
    formatter
  }
  private val dateFormatter = {
    val formatter = new SimpleDateFormat("yyyy-MM-dd")
    formatter.setTimeZone(TimeZone.getTimeZone("UTC"))
    formatter
  }
  implicit val formats = new org.json4s.DefaultFormats {
    override def dateFormatter = dateTimeFormatter
  }
  implicit val stringReader: ClientResponseReader[String] = ClientResponseReaders.StringReader
  implicit val unitReader: ClientResponseReader[Unit] = ClientResponseReaders.UnitReader
  implicit val jvalueReader: ClientResponseReader[JValue] = ClientResponseReaders.JValueReader
  implicit val jsonReader: ClientResponseReader[Nothing] = JsonFormatsReader
  implicit val stringWriter: RequestWriter[String] = RequestWriters.StringWriter
  implicit val jsonWriter: RequestWriter[Nothing] = JsonFormatsWriter

  var basePath: String = defBasePath
  var apiInvoker: ApiInvoker = defApiInvoker

  def addHeader(key: String, value: String): mutable.HashMap[String, String] = {
    apiInvoker.defaultHeaders += key -> value
  }

  val config: SwaggerConfig = SwaggerConfig.forUrl(new URI(defBasePath))
  val client = new RestClient(config)
  val helper = new DefaultApiAsyncHelper(client, config)

  /**
   * Use the deployed model to classify the input
   * 
   *
   * @param Body The input NDArray 
   * @param DeploymentName Name of the deployment group 
   * @param ModelName ID or name of the deployed model 
   * @return ClassificationResult
   */
  def classify(Body: Prediction, DeploymentName: String, ModelName: String): Option[ClassificationResult] = {
    val await = Try(Await.result(classifyAsync(Body, DeploymentName, ModelName), Duration.Inf))
    await match {
      case Success(i) => Some(await.get)
      case Failure(t) => None
    }
  }

  /**
   * Use the deployed model to classify the input asynchronously
   * 
   *
   * @param Body The input NDArray 
   * @param DeploymentName Name of the deployment group 
   * @param ModelName ID or name of the deployed model 
   * @return Future(ClassificationResult)
   */
  def classifyAsync(Body: Prediction, DeploymentName: String, ModelName: String): Future[ClassificationResult] = {
      helper.classify(Body, DeploymentName, ModelName)
  }

  /**
   * Same as /classify but returns the output as Base64NDArrayBody
   * 
   *
   * @param Body The input NDArray 
   * @param DeploymentName Name of the deployment group 
   * @param ModelName ID or name of the deployed model 
   * @return Base64NDArrayBody
   */
  def classifyarray(Body: Prediction, DeploymentName: String, ModelName: String): Option[Base64NDArrayBody] = {
    val await = Try(Await.result(classifyarrayAsync(Body, DeploymentName, ModelName), Duration.Inf))
    await match {
      case Success(i) => Some(await.get)
      case Failure(t) => None
    }
  }

  /**
   * Same as /classify but returns the output as Base64NDArrayBody asynchronously
   * 
   *
   * @param Body The input NDArray 
   * @param DeploymentName Name of the deployment group 
   * @param ModelName ID or name of the deployed model 
   * @return Future(Base64NDArrayBody)
   */
  def classifyarrayAsync(Body: Prediction, DeploymentName: String, ModelName: String): Future[Base64NDArrayBody] = {
      helper.classifyarray(Body, DeploymentName, ModelName)
  }

  /**
   * Use the deployed model to classify the input, using input image file from multipart form data.
   * 
   *
   * @param DeploymentName Name of the deployment group 
   * @param ModelName ID or name of the deployed model 
   * @param Image The file to upload. (optional)
   * @return ClassificationResult
   */
  def classifyimage(DeploymentName: String, ModelName: String, Image: Option[File] = None): Option[ClassificationResult] = {
    val await = Try(Await.result(classifyimageAsync(DeploymentName, ModelName, Image), Duration.Inf))
    await match {
      case Success(i) => Some(await.get)
      case Failure(t) => None
    }
  }

  /**
   * Use the deployed model to classify the input, using input image file from multipart form data. asynchronously
   * 
   *
   * @param DeploymentName Name of the deployment group 
   * @param ModelName ID or name of the deployed model 
   * @param Image The file to upload. (optional)
   * @return Future(ClassificationResult)
   */
  def classifyimageAsync(DeploymentName: String, ModelName: String, Image: Option[File] = None): Future[ClassificationResult] = {
      helper.classifyimage(DeploymentName, ModelName, Image)
  }

  /**
   * Run inference on the input and returns it as a JsonArrayResponse
   * 
   *
   * @param Body The input NDArray 
   * @param DeploymentName Name of the deployment group 
   * @param ModelName ID or name of the deployed model 
   * @return JsonArrayResponse
   */
  def jsonarray(Body: Prediction, DeploymentName: String, ModelName: String): Option[JsonArrayResponse] = {
    val await = Try(Await.result(jsonarrayAsync(Body, DeploymentName, ModelName), Duration.Inf))
    await match {
      case Success(i) => Some(await.get)
      case Failure(t) => None
    }
  }

  /**
   * Run inference on the input and returns it as a JsonArrayResponse asynchronously
   * 
   *
   * @param Body The input NDArray 
   * @param DeploymentName Name of the deployment group 
   * @param ModelName ID or name of the deployed model 
   * @return Future(JsonArrayResponse)
   */
  def jsonarrayAsync(Body: Prediction, DeploymentName: String, ModelName: String): Future[JsonArrayResponse] = {
      helper.jsonarray(Body, DeploymentName, ModelName)
  }

  /**
   * Get logs file path
   * 
   *
   * @param DeploymentName Name of the deployment group 
   * @param ModelName ID or name of the deployed model 
   * @return String
   */
  def logfilepath(DeploymentName: String, ModelName: String): Option[String] = {
    val await = Try(Await.result(logfilepathAsync(DeploymentName, ModelName), Duration.Inf))
    await match {
      case Success(i) => Some(await.get)
      case Failure(t) => None
    }
  }

  /**
   * Get logs file path asynchronously
   * 
   *
   * @param DeploymentName Name of the deployment group 
   * @param ModelName ID or name of the deployed model 
   * @return Future(String)
   */
  def logfilepathAsync(DeploymentName: String, ModelName: String): Future[String] = {
      helper.logfilepath(DeploymentName, ModelName)
  }

  /**
   * Get logs
   * 
   *
   * @param Body the the log request 
   * @param DeploymentName Name of the deployment group 
   * @param ModelName ID or name of the deployed model 
   * @return LogBatch
   */
  def logs(Body: LogRequest, DeploymentName: String, ModelName: String): Option[LogBatch] = {
    val await = Try(Await.result(logsAsync(Body, DeploymentName, ModelName), Duration.Inf))
    await match {
      case Success(i) => Some(await.get)
      case Failure(t) => None
    }
  }

  /**
   * Get logs asynchronously
   * 
   *
   * @param Body the the log request 
   * @param DeploymentName Name of the deployment group 
   * @param ModelName ID or name of the deployed model 
   * @return Future(LogBatch)
   */
  def logsAsync(Body: LogRequest, DeploymentName: String, ModelName: String): Future[LogBatch] = {
      helper.logs(Body, DeploymentName, ModelName)
  }

  /**
   * Set the model to be served
   * 
   *
   * @param DeploymentName Name of the deployment group 
   * @param ModelName ID or name of the deployed model 
   * @param File The model file to upload (.pb file) (optional)
   * @return ModelStatus
   */
  def modelset(DeploymentName: String, ModelName: String, File: Option[File] = None): Option[ModelStatus] = {
    val await = Try(Await.result(modelsetAsync(DeploymentName, ModelName, File), Duration.Inf))
    await match {
      case Success(i) => Some(await.get)
      case Failure(t) => None
    }
  }

  /**
   * Set the model to be served asynchronously
   * 
   *
   * @param DeploymentName Name of the deployment group 
   * @param ModelName ID or name of the deployed model 
   * @param File The model file to upload (.pb file) (optional)
   * @return Future(ModelStatus)
   */
  def modelsetAsync(DeploymentName: String, ModelName: String, File: Option[File] = None): Future[ModelStatus] = {
      helper.modelset(DeploymentName, ModelName, File)
  }

  /**
   * Update the model to be served
   * 
   *
   * @param DeploymentName Name of the deployment group 
   * @param ModelName ID or name of the deployed model 
   * @param File The model file to update with (.pb file) (optional)
   * @return ModelStatus
   */
  def modelupdate(DeploymentName: String, ModelName: String, File: Option[File] = None): Option[ModelStatus] = {
    val await = Try(Await.result(modelupdateAsync(DeploymentName, ModelName, File), Duration.Inf))
    await match {
      case Success(i) => Some(await.get)
      case Failure(t) => None
    }
  }

  /**
   * Update the model to be served asynchronously
   * 
   *
   * @param DeploymentName Name of the deployment group 
   * @param ModelName ID or name of the deployed model 
   * @param File The model file to update with (.pb file) (optional)
   * @return Future(ModelStatus)
   */
  def modelupdateAsync(DeploymentName: String, ModelName: String, File: Option[File] = None): Future[ModelStatus] = {
      helper.modelupdate(DeploymentName, ModelName, File)
  }

  /**
   * Represents all of the labels for a given classification
   * 
   *
   * @param Body The input NDArray 
   * @param DeploymentName Name of the deployment group 
   * @param ModelName ID or name of the deployed model 
   * @return MultiClassClassificationResult
   */
  def multiclassify(Body: Prediction, DeploymentName: String, ModelName: String): Option[MultiClassClassificationResult] = {
    val await = Try(Await.result(multiclassifyAsync(Body, DeploymentName, ModelName), Duration.Inf))
    await match {
      case Success(i) => Some(await.get)
      case Failure(t) => None
    }
  }

  /**
   * Represents all of the labels for a given classification asynchronously
   * 
   *
   * @param Body The input NDArray 
   * @param DeploymentName Name of the deployment group 
   * @param ModelName ID or name of the deployed model 
   * @return Future(MultiClassClassificationResult)
   */
  def multiclassifyAsync(Body: Prediction, DeploymentName: String, ModelName: String): Future[MultiClassClassificationResult] = {
      helper.multiclassify(Body, DeploymentName, ModelName)
  }

  /**
   * Run inference on the input array.
   * 
   *
   * @param Body The input NDArray 
   * @param DeploymentName Name of the deployment group 
   * @param ModelName ID or name of the deployed model 
   * @return Prediction
   */
  def predict(Body: Prediction, DeploymentName: String, ModelName: String): Option[Prediction] = {
    val await = Try(Await.result(predictAsync(Body, DeploymentName, ModelName), Duration.Inf))
    await match {
      case Success(i) => Some(await.get)
      case Failure(t) => None
    }
  }

  /**
   * Run inference on the input array. asynchronously
   * 
   *
   * @param Body The input NDArray 
   * @param DeploymentName Name of the deployment group 
   * @param ModelName ID or name of the deployed model 
   * @return Future(Prediction)
   */
  def predictAsync(Body: Prediction, DeploymentName: String, ModelName: String): Future[Prediction] = {
      helper.predict(Body, DeploymentName, ModelName)
  }

  /**
   * Run inference on the input array, using input image file from multipart form data.
   * 
   *
   * @param DeploymentName Name of the deployment group 
   * @param ModelName ID or name of the deployed model 
   * @param Image The file to upload. (optional)
   * @return Prediction
   */
  def predict_0(DeploymentName: String, ModelName: String, Image: Option[File] = None): Option[Prediction] = {
    val await = Try(Await.result(predict_0Async(DeploymentName, ModelName, Image), Duration.Inf))
    await match {
      case Success(i) => Some(await.get)
      case Failure(t) => None
    }
  }

  /**
   * Run inference on the input array, using input image file from multipart form data. asynchronously
   * 
   *
   * @param DeploymentName Name of the deployment group 
   * @param ModelName ID or name of the deployed model 
   * @param Image The file to upload. (optional)
   * @return Future(Prediction)
   */
  def predict_0Async(DeploymentName: String, ModelName: String, Image: Option[File] = None): Future[Prediction] = {
      helper.predict_0(DeploymentName, ModelName, Image)
  }

  /**
   * Preprocesses the input and run inference on it
   * 
   *
   * @param Body The input array 
   * @param DeploymentName Name of the deployment group 
   * @param ModelName ID or name of the deployed model 
   * @return Prediction
   */
  def predictwithpreprocess(Body: List[String], DeploymentName: String, ModelName: String): Option[Prediction] = {
    val await = Try(Await.result(predictwithpreprocessAsync(Body, DeploymentName, ModelName), Duration.Inf))
    await match {
      case Success(i) => Some(await.get)
      case Failure(t) => None
    }
  }

  /**
   * Preprocesses the input and run inference on it asynchronously
   * 
   *
   * @param Body The input array 
   * @param DeploymentName Name of the deployment group 
   * @param ModelName ID or name of the deployed model 
   * @return Future(Prediction)
   */
  def predictwithpreprocessAsync(Body: List[String], DeploymentName: String, ModelName: String): Future[Prediction] = {
      helper.predictwithpreprocess(Body, DeploymentName, ModelName)
  }

  /**
   * Preprocesses the input and run inference on it and returns it as a JsonArrayResponse
   * 
   *
   * @param Body The input array 
   * @param DeploymentName Name of the deployment group 
   * @param ModelName ID or name of the deployed model 
   * @return JsonArrayResponse
   */
  def predictwithpreprocessjson(Body: List[String], DeploymentName: String, ModelName: String): Option[JsonArrayResponse] = {
    val await = Try(Await.result(predictwithpreprocessjsonAsync(Body, DeploymentName, ModelName), Duration.Inf))
    await match {
      case Success(i) => Some(await.get)
      case Failure(t) => None
    }
  }

  /**
   * Preprocesses the input and run inference on it and returns it as a JsonArrayResponse asynchronously
   * 
   *
   * @param Body The input array 
   * @param DeploymentName Name of the deployment group 
   * @param ModelName ID or name of the deployed model 
   * @return Future(JsonArrayResponse)
   */
  def predictwithpreprocessjsonAsync(Body: List[String], DeploymentName: String, ModelName: String): Future[JsonArrayResponse] = {
      helper.predictwithpreprocessjson(Body, DeploymentName, ModelName)
  }

}

class DefaultApiAsyncHelper(client: TransportClient, config: SwaggerConfig) extends ApiClient(client, config) {

  def classify(Body: Prediction,
    DeploymentName: String,
    ModelName: String)(implicit reader: ClientResponseReader[ClassificationResult], writer: RequestWriter[Prediction]): Future[ClassificationResult] = {
    // create path and map variables
    val path = (addFmt("/{deploymentName}/model/{modelName}/default/classify")
      replaceAll("\\{" + "deploymentName" + "\\}", DeploymentName.toString)
      replaceAll("\\{" + "modelName" + "\\}", ModelName.toString))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]

    if (Body == null) throw new Exception("Missing required parameter 'Body' when calling DefaultApi->classify")
    if (DeploymentName == null) throw new Exception("Missing required parameter 'DeploymentName' when calling DefaultApi->classify")

    if (ModelName == null) throw new Exception("Missing required parameter 'ModelName' when calling DefaultApi->classify")


    val resFuture = client.submit("POST", path, queryParams.toMap, headerParams.toMap, writer.write(Body))
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  def classifyarray(Body: Prediction,
    DeploymentName: String,
    ModelName: String)(implicit reader: ClientResponseReader[Base64NDArrayBody], writer: RequestWriter[Prediction]): Future[Base64NDArrayBody] = {
    // create path and map variables
    val path = (addFmt("/{deploymentName}/model/{modelName}/default/classifyarray")
      replaceAll("\\{" + "deploymentName" + "\\}", DeploymentName.toString)
      replaceAll("\\{" + "modelName" + "\\}", ModelName.toString))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]

    if (Body == null) throw new Exception("Missing required parameter 'Body' when calling DefaultApi->classifyarray")
    if (DeploymentName == null) throw new Exception("Missing required parameter 'DeploymentName' when calling DefaultApi->classifyarray")

    if (ModelName == null) throw new Exception("Missing required parameter 'ModelName' when calling DefaultApi->classifyarray")


    val resFuture = client.submit("POST", path, queryParams.toMap, headerParams.toMap, writer.write(Body))
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  def classifyimage(DeploymentName: String,
    ModelName: String,
    Image: Option[File] = None
    )(implicit reader: ClientResponseReader[ClassificationResult]): Future[ClassificationResult] = {
    // create path and map variables
    val path = (addFmt("/{deploymentName}/model/{modelName}/default/classifyimage")
      replaceAll("\\{" + "deploymentName" + "\\}", DeploymentName.toString)
      replaceAll("\\{" + "modelName" + "\\}", ModelName.toString))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]

    if (DeploymentName == null) throw new Exception("Missing required parameter 'DeploymentName' when calling DefaultApi->classifyimage")

    if (ModelName == null) throw new Exception("Missing required parameter 'ModelName' when calling DefaultApi->classifyimage")


    val resFuture = client.submit("POST", path, queryParams.toMap, headerParams.toMap, "")
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  def jsonarray(Body: Prediction,
    DeploymentName: String,
    ModelName: String)(implicit reader: ClientResponseReader[JsonArrayResponse], writer: RequestWriter[Prediction]): Future[JsonArrayResponse] = {
    // create path and map variables
    val path = (addFmt("/{deploymentName}/model/{modelName}/default/jsonarray")
      replaceAll("\\{" + "deploymentName" + "\\}", DeploymentName.toString)
      replaceAll("\\{" + "modelName" + "\\}", ModelName.toString))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]

    if (Body == null) throw new Exception("Missing required parameter 'Body' when calling DefaultApi->jsonarray")
    if (DeploymentName == null) throw new Exception("Missing required parameter 'DeploymentName' when calling DefaultApi->jsonarray")

    if (ModelName == null) throw new Exception("Missing required parameter 'ModelName' when calling DefaultApi->jsonarray")


    val resFuture = client.submit("POST", path, queryParams.toMap, headerParams.toMap, writer.write(Body))
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  def logfilepath(DeploymentName: String,
    ModelName: String)(implicit reader: ClientResponseReader[String]): Future[String] = {
    // create path and map variables
    val path = (addFmt("/{deploymentName}/model/{modelName}/default/logfilepath")
      replaceAll("\\{" + "deploymentName" + "\\}", DeploymentName.toString)
      replaceAll("\\{" + "modelName" + "\\}", ModelName.toString))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]

    if (DeploymentName == null) throw new Exception("Missing required parameter 'DeploymentName' when calling DefaultApi->logfilepath")

    if (ModelName == null) throw new Exception("Missing required parameter 'ModelName' when calling DefaultApi->logfilepath")


    val resFuture = client.submit("GET", path, queryParams.toMap, headerParams.toMap, "")
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  def logs(Body: LogRequest,
    DeploymentName: String,
    ModelName: String)(implicit reader: ClientResponseReader[LogBatch], writer: RequestWriter[LogRequest]): Future[LogBatch] = {
    // create path and map variables
    val path = (addFmt("/{deploymentName}/model/{modelName}/default/logs")
      replaceAll("\\{" + "deploymentName" + "\\}", DeploymentName.toString)
      replaceAll("\\{" + "modelName" + "\\}", ModelName.toString))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]

    if (Body == null) throw new Exception("Missing required parameter 'Body' when calling DefaultApi->logs")
    if (DeploymentName == null) throw new Exception("Missing required parameter 'DeploymentName' when calling DefaultApi->logs")

    if (ModelName == null) throw new Exception("Missing required parameter 'ModelName' when calling DefaultApi->logs")


    val resFuture = client.submit("POST", path, queryParams.toMap, headerParams.toMap, writer.write(Body))
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  def modelset(DeploymentName: String,
    ModelName: String,
    File: Option[File] = None
    )(implicit reader: ClientResponseReader[ModelStatus]): Future[ModelStatus] = {
    // create path and map variables
    val path = (addFmt("/{deploymentName}/model/{modelName}/default/modelset")
      replaceAll("\\{" + "deploymentName" + "\\}", DeploymentName.toString)
      replaceAll("\\{" + "modelName" + "\\}", ModelName.toString))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]

    if (DeploymentName == null) throw new Exception("Missing required parameter 'DeploymentName' when calling DefaultApi->modelset")

    if (ModelName == null) throw new Exception("Missing required parameter 'ModelName' when calling DefaultApi->modelset")


    val resFuture = client.submit("POST", path, queryParams.toMap, headerParams.toMap, "")
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  def modelupdate(DeploymentName: String,
    ModelName: String,
    File: Option[File] = None
    )(implicit reader: ClientResponseReader[ModelStatus]): Future[ModelStatus] = {
    // create path and map variables
    val path = (addFmt("/{deploymentName}/model/{modelName}/default/modelupdate")
      replaceAll("\\{" + "deploymentName" + "\\}", DeploymentName.toString)
      replaceAll("\\{" + "modelName" + "\\}", ModelName.toString))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]

    if (DeploymentName == null) throw new Exception("Missing required parameter 'DeploymentName' when calling DefaultApi->modelupdate")

    if (ModelName == null) throw new Exception("Missing required parameter 'ModelName' when calling DefaultApi->modelupdate")


    val resFuture = client.submit("POST", path, queryParams.toMap, headerParams.toMap, "")
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  def multiclassify(Body: Prediction,
    DeploymentName: String,
    ModelName: String)(implicit reader: ClientResponseReader[MultiClassClassificationResult], writer: RequestWriter[Prediction]): Future[MultiClassClassificationResult] = {
    // create path and map variables
    val path = (addFmt("/{deploymentName}/model/{modelName}/default/multiclassify")
      replaceAll("\\{" + "deploymentName" + "\\}", DeploymentName.toString)
      replaceAll("\\{" + "modelName" + "\\}", ModelName.toString))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]

    if (Body == null) throw new Exception("Missing required parameter 'Body' when calling DefaultApi->multiclassify")
    if (DeploymentName == null) throw new Exception("Missing required parameter 'DeploymentName' when calling DefaultApi->multiclassify")

    if (ModelName == null) throw new Exception("Missing required parameter 'ModelName' when calling DefaultApi->multiclassify")


    val resFuture = client.submit("POST", path, queryParams.toMap, headerParams.toMap, writer.write(Body))
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  def predict(Body: Prediction,
    DeploymentName: String,
    ModelName: String)(implicit reader: ClientResponseReader[Prediction], writer: RequestWriter[Prediction]): Future[Prediction] = {
    // create path and map variables
    val path = (addFmt("/{deploymentName}/model/{modelName}/default/predict")
      replaceAll("\\{" + "deploymentName" + "\\}", DeploymentName.toString)
      replaceAll("\\{" + "modelName" + "\\}", ModelName.toString))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]

    if (Body == null) throw new Exception("Missing required parameter 'Body' when calling DefaultApi->predict")
    if (DeploymentName == null) throw new Exception("Missing required parameter 'DeploymentName' when calling DefaultApi->predict")

    if (ModelName == null) throw new Exception("Missing required parameter 'ModelName' when calling DefaultApi->predict")


    val resFuture = client.submit("POST", path, queryParams.toMap, headerParams.toMap, writer.write(Body))
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  def predict_0(DeploymentName: String,
    ModelName: String,
    Image: Option[File] = None
    )(implicit reader: ClientResponseReader[Prediction]): Future[Prediction] = {
    // create path and map variables
    val path = (addFmt("/{deploymentName}/model/{modelName}/default/predictimage")
      replaceAll("\\{" + "deploymentName" + "\\}", DeploymentName.toString)
      replaceAll("\\{" + "modelName" + "\\}", ModelName.toString))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]

    if (DeploymentName == null) throw new Exception("Missing required parameter 'DeploymentName' when calling DefaultApi->predict_0")

    if (ModelName == null) throw new Exception("Missing required parameter 'ModelName' when calling DefaultApi->predict_0")


    val resFuture = client.submit("POST", path, queryParams.toMap, headerParams.toMap, "")
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  def predictwithpreprocess(Body: List[String],
    DeploymentName: String,
    ModelName: String)(implicit reader: ClientResponseReader[Prediction], writer: RequestWriter[List[String]]): Future[Prediction] = {
    // create path and map variables
    val path = (addFmt("/{deploymentName}/model/{modelName}/default/predictwithpreprocess")
      replaceAll("\\{" + "deploymentName" + "\\}", DeploymentName.toString)
      replaceAll("\\{" + "modelName" + "\\}", ModelName.toString))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]

    if (DeploymentName == null) throw new Exception("Missing required parameter 'DeploymentName' when calling DefaultApi->predictwithpreprocess")

    if (ModelName == null) throw new Exception("Missing required parameter 'ModelName' when calling DefaultApi->predictwithpreprocess")


    val resFuture = client.submit("POST", path, queryParams.toMap, headerParams.toMap, writer.write(Body))
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  def predictwithpreprocessjson(Body: List[String],
    DeploymentName: String,
    ModelName: String)(implicit reader: ClientResponseReader[JsonArrayResponse], writer: RequestWriter[List[String]]): Future[JsonArrayResponse] = {
    // create path and map variables
    val path = (addFmt("/{deploymentName}/model/{modelName}/default/predictwithpreprocessjson")
      replaceAll("\\{" + "deploymentName" + "\\}", DeploymentName.toString)
      replaceAll("\\{" + "modelName" + "\\}", ModelName.toString))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]

    if (DeploymentName == null) throw new Exception("Missing required parameter 'DeploymentName' when calling DefaultApi->predictwithpreprocessjson")

    if (ModelName == null) throw new Exception("Missing required parameter 'ModelName' when calling DefaultApi->predictwithpreprocessjson")


    val resFuture = client.submit("POST", path, queryParams.toMap, headerParams.toMap, writer.write(Body))
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }


}