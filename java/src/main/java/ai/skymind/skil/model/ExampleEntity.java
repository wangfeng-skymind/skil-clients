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
 * ExampleEntity
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-09-06T20:00:52.936+05:00")
public class ExampleEntity {
  @SerializedName("exampleId")
  private String exampleId = null;

  @SerializedName("exampleVersion")
  private Integer exampleVersion = null;

  @SerializedName("int rowNumber")
  private Integer intRowNumber = null;

  @SerializedName("created")
  private Long created = null;

  @SerializedName("miniBatchId")
  private String miniBatchId = null;

  @SerializedName("miniBatchVersion")
  private Integer miniBatchVersion = null;

  public ExampleEntity exampleId(String exampleId) {
    this.exampleId = exampleId;
    return this;
  }

   /**
   * the GUID of the example
   * @return exampleId
  **/
  @ApiModelProperty(value = "the GUID of the example")
  public String getExampleId() {
    return exampleId;
  }

  public void setExampleId(String exampleId) {
    this.exampleId = exampleId;
  }

  public ExampleEntity exampleVersion(Integer exampleVersion) {
    this.exampleVersion = exampleVersion;
    return this;
  }

   /**
   * Example version
   * @return exampleVersion
  **/
  @ApiModelProperty(value = "Example version")
  public Integer getExampleVersion() {
    return exampleVersion;
  }

  public void setExampleVersion(Integer exampleVersion) {
    this.exampleVersion = exampleVersion;
  }

  public ExampleEntity intRowNumber(Integer intRowNumber) {
    this.intRowNumber = intRowNumber;
    return this;
  }

   /**
   * Row Number
   * @return intRowNumber
  **/
  @ApiModelProperty(value = "Row Number")
  public Integer getIntRowNumber() {
    return intRowNumber;
  }

  public void setIntRowNumber(Integer intRowNumber) {
    this.intRowNumber = intRowNumber;
  }

  public ExampleEntity created(Long created) {
    this.created = created;
    return this;
  }

   /**
   * when the example was created
   * @return created
  **/
  @ApiModelProperty(value = "when the example was created")
  public Long getCreated() {
    return created;
  }

  public void setCreated(Long created) {
    this.created = created;
  }

  public ExampleEntity miniBatchId(String miniBatchId) {
    this.miniBatchId = miniBatchId;
    return this;
  }

   /**
   * The GUID of the minibatch
   * @return miniBatchId
  **/
  @ApiModelProperty(value = "The GUID of the minibatch")
  public String getMiniBatchId() {
    return miniBatchId;
  }

  public void setMiniBatchId(String miniBatchId) {
    this.miniBatchId = miniBatchId;
  }

  public ExampleEntity miniBatchVersion(Integer miniBatchVersion) {
    this.miniBatchVersion = miniBatchVersion;
    return this;
  }

   /**
   * minibatch version
   * @return miniBatchVersion
  **/
  @ApiModelProperty(value = "minibatch version")
  public Integer getMiniBatchVersion() {
    return miniBatchVersion;
  }

  public void setMiniBatchVersion(Integer miniBatchVersion) {
    this.miniBatchVersion = miniBatchVersion;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ExampleEntity exampleEntity = (ExampleEntity) o;
    return Objects.equals(this.exampleId, exampleEntity.exampleId) &&
        Objects.equals(this.exampleVersion, exampleEntity.exampleVersion) &&
        Objects.equals(this.intRowNumber, exampleEntity.intRowNumber) &&
        Objects.equals(this.created, exampleEntity.created) &&
        Objects.equals(this.miniBatchId, exampleEntity.miniBatchId) &&
        Objects.equals(this.miniBatchVersion, exampleEntity.miniBatchVersion);
  }

  @Override
  public int hashCode() {
    return Objects.hash(exampleId, exampleVersion, intRowNumber, created, miniBatchId, miniBatchVersion);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExampleEntity {\n");
    
    sb.append("    exampleId: ").append(toIndentedString(exampleId)).append("\n");
    sb.append("    exampleVersion: ").append(toIndentedString(exampleVersion)).append("\n");
    sb.append("    intRowNumber: ").append(toIndentedString(intRowNumber)).append("\n");
    sb.append("    created: ").append(toIndentedString(created)).append("\n");
    sb.append("    miniBatchId: ").append(toIndentedString(miniBatchId)).append("\n");
    sb.append("    miniBatchVersion: ").append(toIndentedString(miniBatchVersion)).append("\n");
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

