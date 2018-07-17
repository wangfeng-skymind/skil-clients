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
import ai.skymind.skil.model.SingleImageRecord;
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
 * BatchImageRecord
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-07-17T18:18:25.542+05:00")
public class BatchImageRecord {
  @SerializedName("records")
  private List<SingleImageRecord> records = new ArrayList<SingleImageRecord>();

  public BatchImageRecord records(List<SingleImageRecord> records) {
    this.records = records;
    return this;
  }

  public BatchImageRecord addRecordsItem(SingleImageRecord recordsItem) {
    this.records.add(recordsItem);
    return this;
  }

   /**
   * Get records
   * @return records
  **/
  @ApiModelProperty(required = true, value = "")
  public List<SingleImageRecord> getRecords() {
    return records;
  }

  public void setRecords(List<SingleImageRecord> records) {
    this.records = records;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BatchImageRecord batchImageRecord = (BatchImageRecord) o;
    return Objects.equals(this.records, batchImageRecord.records);
  }

  @Override
  public int hashCode() {
    return Objects.hash(records);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BatchImageRecord {\n");
    
    sb.append("    records: ").append(toIndentedString(records)).append("\n");
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

