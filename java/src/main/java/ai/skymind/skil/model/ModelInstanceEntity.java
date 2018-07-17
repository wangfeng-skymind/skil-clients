/*
 * Endpoints
 * Endpoints API for different services in SKIL
 *
 * OpenAPI spec version: 1.1.0-beta
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package ai.skymind.skil.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * ModelInstanceEntity
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-07-17T18:29:30.949+05:00")
public class ModelInstanceEntity {
  @SerializedName("uri")
  private String uri = null;

  @SerializedName("etlJson")
  private String etlJson = null;

  @SerializedName("modelId")
  private String modelId = null;

  @SerializedName("modelLabels")
  private String modelLabels = null;

  @SerializedName("inputFormats")
  private String inputFormats = null;

  @SerializedName("created")
  private Long created = null;

  @SerializedName("notebookJson")
  private String notebookJson = null;

  @SerializedName("evalId")
  private String evalId = null;

  @SerializedName("modelName")
  private String modelName = null;

  @SerializedName("originalModelId")
  private String originalModelId = null;

  @SerializedName("modelVersion")
  private String modelVersion = null;

  @SerializedName("experimentId")
  private String experimentId = null;

  public ModelInstanceEntity uri(String uri) {
    this.uri = uri;
    return this;
  }

   /**
   * The model URI
   * @return uri
  **/
  @ApiModelProperty(value = "The model URI")
  public String getUri() {
    return uri;
  }

  public void setUri(String uri) {
    this.uri = uri;
  }

  public ModelInstanceEntity etlJson(String etlJson) {
    this.etlJson = etlJson;
    return this;
  }

   /**
   * The json string for the ETL (Extract, Transform and Load)
   * @return etlJson
  **/
  @ApiModelProperty(value = "The json string for the ETL (Extract, Transform and Load)")
  public String getEtlJson() {
    return etlJson;
  }

  public void setEtlJson(String etlJson) {
    this.etlJson = etlJson;
  }

  public ModelInstanceEntity modelId(String modelId) {
    this.modelId = modelId;
    return this;
  }

   /**
   * GUID of the model.
   * @return modelId
  **/
  @ApiModelProperty(value = "GUID of the model.")
  public String getModelId() {
    return modelId;
  }

  public void setModelId(String modelId) {
    this.modelId = modelId;
  }

  public ModelInstanceEntity modelLabels(String modelLabels) {
    this.modelLabels = modelLabels;
    return this;
  }

   /**
   * Comma-separated labels string for the model
   * @return modelLabels
  **/
  @ApiModelProperty(value = "Comma-separated labels string for the model")
  public String getModelLabels() {
    return modelLabels;
  }

  public void setModelLabels(String modelLabels) {
    this.modelLabels = modelLabels;
  }

  public ModelInstanceEntity inputFormats(String inputFormats) {
    this.inputFormats = inputFormats;
    return this;
  }

   /**
   * Format for the model input
   * @return inputFormats
  **/
  @ApiModelProperty(value = "Format for the model input")
  public String getInputFormats() {
    return inputFormats;
  }

  public void setInputFormats(String inputFormats) {
    this.inputFormats = inputFormats;
  }

  public ModelInstanceEntity created(Long created) {
    this.created = created;
    return this;
  }

   /**
   * When the model was created
   * @return created
  **/
  @ApiModelProperty(value = "When the model was created")
  public Long getCreated() {
    return created;
  }

  public void setCreated(Long created) {
    this.created = created;
  }

  public ModelInstanceEntity notebookJson(String notebookJson) {
    this.notebookJson = notebookJson;
    return this;
  }

   /**
   * JSON string of the associated Zeppelin Notebook
   * @return notebookJson
  **/
  @ApiModelProperty(value = "JSON string of the associated Zeppelin Notebook")
  public String getNotebookJson() {
    return notebookJson;
  }

  public void setNotebookJson(String notebookJson) {
    this.notebookJson = notebookJson;
  }

  public ModelInstanceEntity evalId(String evalId) {
    this.evalId = evalId;
    return this;
  }

   /**
   * GUID for the model evaluation
   * @return evalId
  **/
  @ApiModelProperty(value = "GUID for the model evaluation")
  public String getEvalId() {
    return evalId;
  }

  public void setEvalId(String evalId) {
    this.evalId = evalId;
  }

  public ModelInstanceEntity modelName(String modelName) {
    this.modelName = modelName;
    return this;
  }

   /**
   * Model&#39;s name
   * @return modelName
  **/
  @ApiModelProperty(value = "Model's name")
  public String getModelName() {
    return modelName;
  }

  public void setModelName(String modelName) {
    this.modelName = modelName;
  }

  public ModelInstanceEntity originalModelId(String originalModelId) {
    this.originalModelId = originalModelId;
    return this;
  }

   /**
   * Original GUID of the model (used for maintaining revisions of a particular model)
   * @return originalModelId
  **/
  @ApiModelProperty(value = "Original GUID of the model (used for maintaining revisions of a particular model)")
  public String getOriginalModelId() {
    return originalModelId;
  }

  public void setOriginalModelId(String originalModelId) {
    this.originalModelId = originalModelId;
  }

  public ModelInstanceEntity modelVersion(String modelVersion) {
    this.modelVersion = modelVersion;
    return this;
  }

   /**
   * Model version
   * @return modelVersion
  **/
  @ApiModelProperty(value = "Model version")
  public String getModelVersion() {
    return modelVersion;
  }

  public void setModelVersion(String modelVersion) {
    this.modelVersion = modelVersion;
  }

  public ModelInstanceEntity experimentId(String experimentId) {
    this.experimentId = experimentId;
    return this;
  }

   /**
   * GUID of the Experiment which is associated with the model.
   * @return experimentId
  **/
  @ApiModelProperty(value = "GUID of the Experiment which is associated with the model.")
  public String getExperimentId() {
    return experimentId;
  }

  public void setExperimentId(String experimentId) {
    this.experimentId = experimentId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ModelInstanceEntity modelInstanceEntity = (ModelInstanceEntity) o;
    return Objects.equals(this.uri, modelInstanceEntity.uri) &&
        Objects.equals(this.etlJson, modelInstanceEntity.etlJson) &&
        Objects.equals(this.modelId, modelInstanceEntity.modelId) &&
        Objects.equals(this.modelLabels, modelInstanceEntity.modelLabels) &&
        Objects.equals(this.inputFormats, modelInstanceEntity.inputFormats) &&
        Objects.equals(this.created, modelInstanceEntity.created) &&
        Objects.equals(this.notebookJson, modelInstanceEntity.notebookJson) &&
        Objects.equals(this.evalId, modelInstanceEntity.evalId) &&
        Objects.equals(this.modelName, modelInstanceEntity.modelName) &&
        Objects.equals(this.originalModelId, modelInstanceEntity.originalModelId) &&
        Objects.equals(this.modelVersion, modelInstanceEntity.modelVersion) &&
        Objects.equals(this.experimentId, modelInstanceEntity.experimentId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(uri, etlJson, modelId, modelLabels, inputFormats, created, notebookJson, evalId, modelName, originalModelId, modelVersion, experimentId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ModelInstanceEntity {\n");
    
    sb.append("    uri: ").append(toIndentedString(uri)).append("\n");
    sb.append("    etlJson: ").append(toIndentedString(etlJson)).append("\n");
    sb.append("    modelId: ").append(toIndentedString(modelId)).append("\n");
    sb.append("    modelLabels: ").append(toIndentedString(modelLabels)).append("\n");
    sb.append("    inputFormats: ").append(toIndentedString(inputFormats)).append("\n");
    sb.append("    created: ").append(toIndentedString(created)).append("\n");
    sb.append("    notebookJson: ").append(toIndentedString(notebookJson)).append("\n");
    sb.append("    evalId: ").append(toIndentedString(evalId)).append("\n");
    sb.append("    modelName: ").append(toIndentedString(modelName)).append("\n");
    sb.append("    originalModelId: ").append(toIndentedString(originalModelId)).append("\n");
    sb.append("    modelVersion: ").append(toIndentedString(modelVersion)).append("\n");
    sb.append("    experimentId: ").append(toIndentedString(experimentId)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

