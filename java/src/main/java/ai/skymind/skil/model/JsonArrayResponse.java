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
import ai.skymind.skil.model.INDArray;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * JsonArrayResponse
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-07-17T18:29:30.949+05:00")
public class JsonArrayResponse {
  @SerializedName("array")
  private INDArray array = null;

  public JsonArrayResponse array(INDArray array) {
    this.array = array;
    return this;
  }

   /**
   * Get array
   * @return array
  **/
  @ApiModelProperty(value = "")
  public INDArray getArray() {
    return array;
  }

  public void setArray(INDArray array) {
    this.array = array;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    JsonArrayResponse jsonArrayResponse = (JsonArrayResponse) o;
    return Objects.equals(this.array, jsonArrayResponse.array);
  }

  @Override
  public int hashCode() {
    return Objects.hash(array);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class JsonArrayResponse {\n");
    
    sb.append("    array: ").append(toIndentedString(array)).append("\n");
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

