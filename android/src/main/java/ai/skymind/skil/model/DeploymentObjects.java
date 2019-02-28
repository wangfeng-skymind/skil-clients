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

import ai.skymind.skil.model.ModelResponse;
import java.util.*;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;
import java.io.Serializable;

@ApiModel(description = "")
public class DeploymentObjects implements Serializable {
  
  @SerializedName("models")
  private List<ModelResponse> models = null;
  @SerializedName("transforms")
  private List<ModelResponse> transforms = null;
  @SerializedName("knn")
  private List<ModelResponse> knn = null;

  /**
   **/
  @ApiModelProperty(value = "")
  public List<ModelResponse> getModels() {
    return models;
  }
  public void setModels(List<ModelResponse> models) {
    this.models = models;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public List<ModelResponse> getTransforms() {
    return transforms;
  }
  public void setTransforms(List<ModelResponse> transforms) {
    this.transforms = transforms;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public List<ModelResponse> getKnn() {
    return knn;
  }
  public void setKnn(List<ModelResponse> knn) {
    this.knn = knn;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DeploymentObjects deploymentObjects = (DeploymentObjects) o;
    return (this.models == null ? deploymentObjects.models == null : this.models.equals(deploymentObjects.models)) &&
        (this.transforms == null ? deploymentObjects.transforms == null : this.transforms.equals(deploymentObjects.transforms)) &&
        (this.knn == null ? deploymentObjects.knn == null : this.knn.equals(deploymentObjects.knn));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.models == null ? 0: this.models.hashCode());
    result = 31 * result + (this.transforms == null ? 0: this.transforms.hashCode());
    result = 31 * result + (this.knn == null ? 0: this.knn.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class DeploymentObjects {\n");
    
    sb.append("  models: ").append(models).append("\n");
    sb.append("  transforms: ").append(transforms).append("\n");
    sb.append("  knn: ").append(knn).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}