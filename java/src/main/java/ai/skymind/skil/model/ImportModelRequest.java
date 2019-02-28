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
import java.util.ArrayList;
import java.util.List;

/**
 * ImportModelRequest
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-02-28T00:52:55.977+05:00")
public class ImportModelRequest {
  @SerializedName("name")
  private String name = null;

  @SerializedName("scale")
  private Integer scale = null;

  @SerializedName("uri")
  private List<String> uri = null;

  @SerializedName("modelType")
  private String modelType = null;

  @SerializedName("fileLocation")
  private String fileLocation = null;

  @SerializedName("jvmArgs")
  private String jvmArgs = null;

  @SerializedName("subType")
  private String subType = null;

  @SerializedName("labelsFileLocation")
  private String labelsFileLocation = null;

  @SerializedName("extraArgs")
  private String extraArgs = null;

  @SerializedName("etlJson")
  private String etlJson = null;

  @SerializedName("inputNames")
  private List<String> inputNames = null;

  @SerializedName("outputNames")
  private List<String> outputNames = null;

  public ImportModelRequest name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @ApiModelProperty(value = "")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public ImportModelRequest scale(Integer scale) {
    this.scale = scale;
    return this;
  }

   /**
   * Get scale
   * @return scale
  **/
  @ApiModelProperty(value = "")
  public Integer getScale() {
    return scale;
  }

  public void setScale(Integer scale) {
    this.scale = scale;
  }

  public ImportModelRequest uri(List<String> uri) {
    this.uri = uri;
    return this;
  }

  public ImportModelRequest addUriItem(String uriItem) {
    if (this.uri == null) {
      this.uri = new ArrayList<String>();
    }
    this.uri.add(uriItem);
    return this;
  }

   /**
   * Get uri
   * @return uri
  **/
  @ApiModelProperty(value = "")
  public List<String> getUri() {
    return uri;
  }

  public void setUri(List<String> uri) {
    this.uri = uri;
  }

  public ImportModelRequest modelType(String modelType) {
    this.modelType = modelType;
    return this;
  }

   /**
   * Get modelType
   * @return modelType
  **/
  @ApiModelProperty(value = "")
  public String getModelType() {
    return modelType;
  }

  public void setModelType(String modelType) {
    this.modelType = modelType;
  }

  public ImportModelRequest fileLocation(String fileLocation) {
    this.fileLocation = fileLocation;
    return this;
  }

   /**
   * Get fileLocation
   * @return fileLocation
  **/
  @ApiModelProperty(value = "")
  public String getFileLocation() {
    return fileLocation;
  }

  public void setFileLocation(String fileLocation) {
    this.fileLocation = fileLocation;
  }

  public ImportModelRequest jvmArgs(String jvmArgs) {
    this.jvmArgs = jvmArgs;
    return this;
  }

   /**
   * Get jvmArgs
   * @return jvmArgs
  **/
  @ApiModelProperty(value = "")
  public String getJvmArgs() {
    return jvmArgs;
  }

  public void setJvmArgs(String jvmArgs) {
    this.jvmArgs = jvmArgs;
  }

  public ImportModelRequest subType(String subType) {
    this.subType = subType;
    return this;
  }

   /**
   * Get subType
   * @return subType
  **/
  @ApiModelProperty(value = "")
  public String getSubType() {
    return subType;
  }

  public void setSubType(String subType) {
    this.subType = subType;
  }

  public ImportModelRequest labelsFileLocation(String labelsFileLocation) {
    this.labelsFileLocation = labelsFileLocation;
    return this;
  }

   /**
   * Get labelsFileLocation
   * @return labelsFileLocation
  **/
  @ApiModelProperty(value = "")
  public String getLabelsFileLocation() {
    return labelsFileLocation;
  }

  public void setLabelsFileLocation(String labelsFileLocation) {
    this.labelsFileLocation = labelsFileLocation;
  }

  public ImportModelRequest extraArgs(String extraArgs) {
    this.extraArgs = extraArgs;
    return this;
  }

   /**
   * Get extraArgs
   * @return extraArgs
  **/
  @ApiModelProperty(value = "")
  public String getExtraArgs() {
    return extraArgs;
  }

  public void setExtraArgs(String extraArgs) {
    this.extraArgs = extraArgs;
  }

  public ImportModelRequest etlJson(String etlJson) {
    this.etlJson = etlJson;
    return this;
  }

   /**
   * Get etlJson
   * @return etlJson
  **/
  @ApiModelProperty(value = "")
  public String getEtlJson() {
    return etlJson;
  }

  public void setEtlJson(String etlJson) {
    this.etlJson = etlJson;
  }

  public ImportModelRequest inputNames(List<String> inputNames) {
    this.inputNames = inputNames;
    return this;
  }

  public ImportModelRequest addInputNamesItem(String inputNamesItem) {
    if (this.inputNames == null) {
      this.inputNames = new ArrayList<String>();
    }
    this.inputNames.add(inputNamesItem);
    return this;
  }

   /**
   * Get inputNames
   * @return inputNames
  **/
  @ApiModelProperty(value = "")
  public List<String> getInputNames() {
    return inputNames;
  }

  public void setInputNames(List<String> inputNames) {
    this.inputNames = inputNames;
  }

  public ImportModelRequest outputNames(List<String> outputNames) {
    this.outputNames = outputNames;
    return this;
  }

  public ImportModelRequest addOutputNamesItem(String outputNamesItem) {
    if (this.outputNames == null) {
      this.outputNames = new ArrayList<String>();
    }
    this.outputNames.add(outputNamesItem);
    return this;
  }

   /**
   * Get outputNames
   * @return outputNames
  **/
  @ApiModelProperty(value = "")
  public List<String> getOutputNames() {
    return outputNames;
  }

  public void setOutputNames(List<String> outputNames) {
    this.outputNames = outputNames;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ImportModelRequest importModelRequest = (ImportModelRequest) o;
    return Objects.equals(this.name, importModelRequest.name) &&
        Objects.equals(this.scale, importModelRequest.scale) &&
        Objects.equals(this.uri, importModelRequest.uri) &&
        Objects.equals(this.modelType, importModelRequest.modelType) &&
        Objects.equals(this.fileLocation, importModelRequest.fileLocation) &&
        Objects.equals(this.jvmArgs, importModelRequest.jvmArgs) &&
        Objects.equals(this.subType, importModelRequest.subType) &&
        Objects.equals(this.labelsFileLocation, importModelRequest.labelsFileLocation) &&
        Objects.equals(this.extraArgs, importModelRequest.extraArgs) &&
        Objects.equals(this.etlJson, importModelRequest.etlJson) &&
        Objects.equals(this.inputNames, importModelRequest.inputNames) &&
        Objects.equals(this.outputNames, importModelRequest.outputNames);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, scale, uri, modelType, fileLocation, jvmArgs, subType, labelsFileLocation, extraArgs, etlJson, inputNames, outputNames);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ImportModelRequest {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    scale: ").append(toIndentedString(scale)).append("\n");
    sb.append("    uri: ").append(toIndentedString(uri)).append("\n");
    sb.append("    modelType: ").append(toIndentedString(modelType)).append("\n");
    sb.append("    fileLocation: ").append(toIndentedString(fileLocation)).append("\n");
    sb.append("    jvmArgs: ").append(toIndentedString(jvmArgs)).append("\n");
    sb.append("    subType: ").append(toIndentedString(subType)).append("\n");
    sb.append("    labelsFileLocation: ").append(toIndentedString(labelsFileLocation)).append("\n");
    sb.append("    extraArgs: ").append(toIndentedString(extraArgs)).append("\n");
    sb.append("    etlJson: ").append(toIndentedString(etlJson)).append("\n");
    sb.append("    inputNames: ").append(toIndentedString(inputNames)).append("\n");
    sb.append("    outputNames: ").append(toIndentedString(outputNames)).append("\n");
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
