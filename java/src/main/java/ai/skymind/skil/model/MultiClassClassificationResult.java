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
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/**
 * Represents all of the labels for a given classification
 */
@ApiModel(description = "Represents all of the labels for a given classification")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-09-06T20:00:52.936+05:00")
public class MultiClassClassificationResult {
  @SerializedName("rankedOutcomes")
  private List<List<String>> rankedOutcomes = null;

  @SerializedName("maxOutcomes")
  private List<String> maxOutcomes = null;

  @SerializedName("probabilities")
  private List<List<BigDecimal>> probabilities = null;

  public MultiClassClassificationResult rankedOutcomes(List<List<String>> rankedOutcomes) {
    this.rankedOutcomes = rankedOutcomes;
    return this;
  }

  public MultiClassClassificationResult addRankedOutcomesItem(List<String> rankedOutcomesItem) {
    if (this.rankedOutcomes == null) {
      this.rankedOutcomes = new ArrayList<List<String>>();
    }
    this.rankedOutcomes.add(rankedOutcomesItem);
    return this;
  }

   /**
   * Get rankedOutcomes
   * @return rankedOutcomes
  **/
  @ApiModelProperty(value = "")
  public List<List<String>> getRankedOutcomes() {
    return rankedOutcomes;
  }

  public void setRankedOutcomes(List<List<String>> rankedOutcomes) {
    this.rankedOutcomes = rankedOutcomes;
  }

  public MultiClassClassificationResult maxOutcomes(List<String> maxOutcomes) {
    this.maxOutcomes = maxOutcomes;
    return this;
  }

  public MultiClassClassificationResult addMaxOutcomesItem(String maxOutcomesItem) {
    if (this.maxOutcomes == null) {
      this.maxOutcomes = new ArrayList<String>();
    }
    this.maxOutcomes.add(maxOutcomesItem);
    return this;
  }

   /**
   * Get maxOutcomes
   * @return maxOutcomes
  **/
  @ApiModelProperty(value = "")
  public List<String> getMaxOutcomes() {
    return maxOutcomes;
  }

  public void setMaxOutcomes(List<String> maxOutcomes) {
    this.maxOutcomes = maxOutcomes;
  }

  public MultiClassClassificationResult probabilities(List<List<BigDecimal>> probabilities) {
    this.probabilities = probabilities;
    return this;
  }

  public MultiClassClassificationResult addProbabilitiesItem(List<BigDecimal> probabilitiesItem) {
    if (this.probabilities == null) {
      this.probabilities = new ArrayList<List<BigDecimal>>();
    }
    this.probabilities.add(probabilitiesItem);
    return this;
  }

   /**
   * Get probabilities
   * @return probabilities
  **/
  @ApiModelProperty(value = "")
  public List<List<BigDecimal>> getProbabilities() {
    return probabilities;
  }

  public void setProbabilities(List<List<BigDecimal>> probabilities) {
    this.probabilities = probabilities;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MultiClassClassificationResult multiClassClassificationResult = (MultiClassClassificationResult) o;
    return Objects.equals(this.rankedOutcomes, multiClassClassificationResult.rankedOutcomes) &&
        Objects.equals(this.maxOutcomes, multiClassClassificationResult.maxOutcomes) &&
        Objects.equals(this.probabilities, multiClassClassificationResult.probabilities);
  }

  @Override
  public int hashCode() {
    return Objects.hash(rankedOutcomes, maxOutcomes, probabilities);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MultiClassClassificationResult {\n");
    
    sb.append("    rankedOutcomes: ").append(toIndentedString(rankedOutcomes)).append("\n");
    sb.append("    maxOutcomes: ").append(toIndentedString(maxOutcomes)).append("\n");
    sb.append("    probabilities: ").append(toIndentedString(probabilities)).append("\n");
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

