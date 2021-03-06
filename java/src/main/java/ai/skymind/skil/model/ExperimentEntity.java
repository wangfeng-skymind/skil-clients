/*
 * Endpoints
 * Endpoints API for different services in SKIL
 *
 * OpenAPI spec version: 1.2.0-rc1
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
 * ExperimentEntity
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-02-28T00:52:55.977+05:00")
public class ExperimentEntity {
  @SerializedName("bestModelId")
  private String bestModelId = null;

  @SerializedName("inputDataUri")
  private String inputDataUri = null;

  @SerializedName("experimentId")
  private String experimentId = null;

  @SerializedName("experimentName")
  private String experimentName = null;

  @SerializedName("experimentDescription")
  private String experimentDescription = null;

  @SerializedName("notebookJson")
  private String notebookJson = null;

  @SerializedName("notebookUrl")
  private String notebookUrl = null;

  @SerializedName("zeppelinId")
  private String zeppelinId = null;

  @SerializedName("modelHistoryId")
  private String modelHistoryId = null;

  @SerializedName("lastUpdated")
  private Long lastUpdated = null;

  public ExperimentEntity bestModelId(String bestModelId) {
    this.bestModelId = bestModelId;
    return this;
  }

   /**
   * GUID of the best selected model in an experiment
   * @return bestModelId
  **/
  @ApiModelProperty(value = "GUID of the best selected model in an experiment")
  public String getBestModelId() {
    return bestModelId;
  }

  public void setBestModelId(String bestModelId) {
    this.bestModelId = bestModelId;
  }

  public ExperimentEntity inputDataUri(String inputDataUri) {
    this.inputDataUri = inputDataUri;
    return this;
  }

   /**
   * Input data URI
   * @return inputDataUri
  **/
  @ApiModelProperty(value = "Input data URI")
  public String getInputDataUri() {
    return inputDataUri;
  }

  public void setInputDataUri(String inputDataUri) {
    this.inputDataUri = inputDataUri;
  }

  public ExperimentEntity experimentId(String experimentId) {
    this.experimentId = experimentId;
    return this;
  }

   /**
   * GUID of the experiment
   * @return experimentId
  **/
  @ApiModelProperty(value = "GUID of the experiment")
  public String getExperimentId() {
    return experimentId;
  }

  public void setExperimentId(String experimentId) {
    this.experimentId = experimentId;
  }

  public ExperimentEntity experimentName(String experimentName) {
    this.experimentName = experimentName;
    return this;
  }

   /**
   * Experiment&#39;s name
   * @return experimentName
  **/
  @ApiModelProperty(value = "Experiment's name")
  public String getExperimentName() {
    return experimentName;
  }

  public void setExperimentName(String experimentName) {
    this.experimentName = experimentName;
  }

  public ExperimentEntity experimentDescription(String experimentDescription) {
    this.experimentDescription = experimentDescription;
    return this;
  }

   /**
   * Experiment&#39;s description
   * @return experimentDescription
  **/
  @ApiModelProperty(value = "Experiment's description")
  public String getExperimentDescription() {
    return experimentDescription;
  }

  public void setExperimentDescription(String experimentDescription) {
    this.experimentDescription = experimentDescription;
  }

  public ExperimentEntity notebookJson(String notebookJson) {
    this.notebookJson = notebookJson;
    return this;
  }

   /**
   * The associated Zeppelin notebook JSON string
   * @return notebookJson
  **/
  @ApiModelProperty(value = "The associated Zeppelin notebook JSON string")
  public String getNotebookJson() {
    return notebookJson;
  }

  public void setNotebookJson(String notebookJson) {
    this.notebookJson = notebookJson;
  }

  public ExperimentEntity notebookUrl(String notebookUrl) {
    this.notebookUrl = notebookUrl;
    return this;
  }

   /**
   * URL of the associated Zeppelin notebook
   * @return notebookUrl
  **/
  @ApiModelProperty(value = "URL of the associated Zeppelin notebook")
  public String getNotebookUrl() {
    return notebookUrl;
  }

  public void setNotebookUrl(String notebookUrl) {
    this.notebookUrl = notebookUrl;
  }

  public ExperimentEntity zeppelinId(String zeppelinId) {
    this.zeppelinId = zeppelinId;
    return this;
  }

   /**
   * Zeppelin ID
   * @return zeppelinId
  **/
  @ApiModelProperty(value = "Zeppelin ID")
  public String getZeppelinId() {
    return zeppelinId;
  }

  public void setZeppelinId(String zeppelinId) {
    this.zeppelinId = zeppelinId;
  }

  public ExperimentEntity modelHistoryId(String modelHistoryId) {
    this.modelHistoryId = modelHistoryId;
    return this;
  }

   /**
   * Id of the model history / workspace
   * @return modelHistoryId
  **/
  @ApiModelProperty(value = "Id of the model history / workspace")
  public String getModelHistoryId() {
    return modelHistoryId;
  }

  public void setModelHistoryId(String modelHistoryId) {
    this.modelHistoryId = modelHistoryId;
  }

  public ExperimentEntity lastUpdated(Long lastUpdated) {
    this.lastUpdated = lastUpdated;
    return this;
  }

   /**
   * Indicates the time when experiment was last updated
   * @return lastUpdated
  **/
  @ApiModelProperty(value = "Indicates the time when experiment was last updated")
  public Long getLastUpdated() {
    return lastUpdated;
  }

  public void setLastUpdated(Long lastUpdated) {
    this.lastUpdated = lastUpdated;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ExperimentEntity experimentEntity = (ExperimentEntity) o;
    return Objects.equals(this.bestModelId, experimentEntity.bestModelId) &&
        Objects.equals(this.inputDataUri, experimentEntity.inputDataUri) &&
        Objects.equals(this.experimentId, experimentEntity.experimentId) &&
        Objects.equals(this.experimentName, experimentEntity.experimentName) &&
        Objects.equals(this.experimentDescription, experimentEntity.experimentDescription) &&
        Objects.equals(this.notebookJson, experimentEntity.notebookJson) &&
        Objects.equals(this.notebookUrl, experimentEntity.notebookUrl) &&
        Objects.equals(this.zeppelinId, experimentEntity.zeppelinId) &&
        Objects.equals(this.modelHistoryId, experimentEntity.modelHistoryId) &&
        Objects.equals(this.lastUpdated, experimentEntity.lastUpdated);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bestModelId, inputDataUri, experimentId, experimentName, experimentDescription, notebookJson, notebookUrl, zeppelinId, modelHistoryId, lastUpdated);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExperimentEntity {\n");
    
    sb.append("    bestModelId: ").append(toIndentedString(bestModelId)).append("\n");
    sb.append("    inputDataUri: ").append(toIndentedString(inputDataUri)).append("\n");
    sb.append("    experimentId: ").append(toIndentedString(experimentId)).append("\n");
    sb.append("    experimentName: ").append(toIndentedString(experimentName)).append("\n");
    sb.append("    experimentDescription: ").append(toIndentedString(experimentDescription)).append("\n");
    sb.append("    notebookJson: ").append(toIndentedString(notebookJson)).append("\n");
    sb.append("    notebookUrl: ").append(toIndentedString(notebookUrl)).append("\n");
    sb.append("    zeppelinId: ").append(toIndentedString(zeppelinId)).append("\n");
    sb.append("    modelHistoryId: ").append(toIndentedString(modelHistoryId)).append("\n");
    sb.append("    lastUpdated: ").append(toIndentedString(lastUpdated)).append("\n");
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

