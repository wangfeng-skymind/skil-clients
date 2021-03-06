/**
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

import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;
import java.io.Serializable;

@ApiModel(description = "")
public class RevisionsWritten implements Serializable {
  
  @SerializedName("numRevisions")
  private Integer numRevisions = null;

  /**
   **/
  @ApiModelProperty(value = "")
  public Integer getNumRevisions() {
    return numRevisions;
  }
  public void setNumRevisions(Integer numRevisions) {
    this.numRevisions = numRevisions;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RevisionsWritten revisionsWritten = (RevisionsWritten) o;
    return (this.numRevisions == null ? revisionsWritten.numRevisions == null : this.numRevisions.equals(revisionsWritten.numRevisions));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.numRevisions == null ? 0: this.numRevisions.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class RevisionsWritten {\n");
    
    sb.append("  numRevisions: ").append(numRevisions).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
