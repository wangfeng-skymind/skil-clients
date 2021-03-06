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
 * FeedbackResponse
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-02-28T00:52:55.977+05:00")
public class FeedbackResponse {
  @SerializedName("retrainThreshold")
  private Integer retrainThreshold = null;

  @SerializedName("accumulatedSoFar")
  private Integer accumulatedSoFar = null;

  public FeedbackResponse retrainThreshold(Integer retrainThreshold) {
    this.retrainThreshold = retrainThreshold;
    return this;
  }

   /**
   * The number of examples required to start the retraining process.
   * @return retrainThreshold
  **/
  @ApiModelProperty(value = "The number of examples required to start the retraining process.")
  public Integer getRetrainThreshold() {
    return retrainThreshold;
  }

  public void setRetrainThreshold(Integer retrainThreshold) {
    this.retrainThreshold = retrainThreshold;
  }

  public FeedbackResponse accumulatedSoFar(Integer accumulatedSoFar) {
    this.accumulatedSoFar = accumulatedSoFar;
    return this;
  }

   /**
   * The number of retraining examples accumulated so far.
   * @return accumulatedSoFar
  **/
  @ApiModelProperty(value = "The number of retraining examples accumulated so far.")
  public Integer getAccumulatedSoFar() {
    return accumulatedSoFar;
  }

  public void setAccumulatedSoFar(Integer accumulatedSoFar) {
    this.accumulatedSoFar = accumulatedSoFar;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FeedbackResponse feedbackResponse = (FeedbackResponse) o;
    return Objects.equals(this.retrainThreshold, feedbackResponse.retrainThreshold) &&
        Objects.equals(this.accumulatedSoFar, feedbackResponse.accumulatedSoFar);
  }

  @Override
  public int hashCode() {
    return Objects.hash(retrainThreshold, accumulatedSoFar);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FeedbackResponse {\n");
    
    sb.append("    retrainThreshold: ").append(toIndentedString(retrainThreshold)).append("\n");
    sb.append("    accumulatedSoFar: ").append(toIndentedString(accumulatedSoFar)).append("\n");
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

