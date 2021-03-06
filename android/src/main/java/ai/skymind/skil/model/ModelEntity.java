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

import java.math.BigDecimal;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;
import java.io.Serializable;

@ApiModel(description = "")
public class ModelEntity implements Serializable {
  
  @SerializedName("id")
  private Long id = null;
  @SerializedName("created")
  private Long created = null;
  @SerializedName("updated")
  private Long updated = null;
  public enum ModelTypeEnum {
     transform,  model,  knn, 
  };
  @SerializedName("modelType")
  private ModelTypeEnum modelType = null;
  @SerializedName("deploymentId")
  private Long deploymentId = null;
  @SerializedName("name")
  private String name = null;
  @SerializedName("scale")
  private BigDecimal scale = null;
  @SerializedName("fileLocation")
  private String fileLocation = null;
  public enum StateEnum {
     created,  starting,  started,  stopping,  stopped,  unhealthy,  failed, 
  };
  @SerializedName("state")
  private StateEnum state = null;
  @SerializedName("jvmArgs")
  private String jvmArgs = null;
  @SerializedName("subType")
  private String subType = null;
  @SerializedName("labelsFileLocation")
  private String labelsFileLocation = null;
  @SerializedName("extraArgs")
  private String extraArgs = null;
  @SerializedName("launchPolicy")
  private Object launchPolicy = null;
  public enum ModelStateEnum {
     CREATED,  STARTING,  STARTED,  STOPPING,  STOPPED,  UNHEALTHY,  FAILED, 
  };
  @SerializedName("modelState")
  private ModelStateEnum modelState = null;

  /**
   **/
  @ApiModelProperty(value = "")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Long getCreated() {
    return created;
  }
  public void setCreated(Long created) {
    this.created = created;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Long getUpdated() {
    return updated;
  }
  public void setUpdated(Long updated) {
    this.updated = updated;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public ModelTypeEnum getModelType() {
    return modelType;
  }
  public void setModelType(ModelTypeEnum modelType) {
    this.modelType = modelType;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Long getDeploymentId() {
    return deploymentId;
  }
  public void setDeploymentId(Long deploymentId) {
    this.deploymentId = deploymentId;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public BigDecimal getScale() {
    return scale;
  }
  public void setScale(BigDecimal scale) {
    this.scale = scale;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getFileLocation() {
    return fileLocation;
  }
  public void setFileLocation(String fileLocation) {
    this.fileLocation = fileLocation;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public StateEnum getState() {
    return state;
  }
  public void setState(StateEnum state) {
    this.state = state;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getJvmArgs() {
    return jvmArgs;
  }
  public void setJvmArgs(String jvmArgs) {
    this.jvmArgs = jvmArgs;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getSubType() {
    return subType;
  }
  public void setSubType(String subType) {
    this.subType = subType;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getLabelsFileLocation() {
    return labelsFileLocation;
  }
  public void setLabelsFileLocation(String labelsFileLocation) {
    this.labelsFileLocation = labelsFileLocation;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getExtraArgs() {
    return extraArgs;
  }
  public void setExtraArgs(String extraArgs) {
    this.extraArgs = extraArgs;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Object getLaunchPolicy() {
    return launchPolicy;
  }
  public void setLaunchPolicy(Object launchPolicy) {
    this.launchPolicy = launchPolicy;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public ModelStateEnum getModelState() {
    return modelState;
  }
  public void setModelState(ModelStateEnum modelState) {
    this.modelState = modelState;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ModelEntity modelEntity = (ModelEntity) o;
    return (this.id == null ? modelEntity.id == null : this.id.equals(modelEntity.id)) &&
        (this.created == null ? modelEntity.created == null : this.created.equals(modelEntity.created)) &&
        (this.updated == null ? modelEntity.updated == null : this.updated.equals(modelEntity.updated)) &&
        (this.modelType == null ? modelEntity.modelType == null : this.modelType.equals(modelEntity.modelType)) &&
        (this.deploymentId == null ? modelEntity.deploymentId == null : this.deploymentId.equals(modelEntity.deploymentId)) &&
        (this.name == null ? modelEntity.name == null : this.name.equals(modelEntity.name)) &&
        (this.scale == null ? modelEntity.scale == null : this.scale.equals(modelEntity.scale)) &&
        (this.fileLocation == null ? modelEntity.fileLocation == null : this.fileLocation.equals(modelEntity.fileLocation)) &&
        (this.state == null ? modelEntity.state == null : this.state.equals(modelEntity.state)) &&
        (this.jvmArgs == null ? modelEntity.jvmArgs == null : this.jvmArgs.equals(modelEntity.jvmArgs)) &&
        (this.subType == null ? modelEntity.subType == null : this.subType.equals(modelEntity.subType)) &&
        (this.labelsFileLocation == null ? modelEntity.labelsFileLocation == null : this.labelsFileLocation.equals(modelEntity.labelsFileLocation)) &&
        (this.extraArgs == null ? modelEntity.extraArgs == null : this.extraArgs.equals(modelEntity.extraArgs)) &&
        (this.launchPolicy == null ? modelEntity.launchPolicy == null : this.launchPolicy.equals(modelEntity.launchPolicy)) &&
        (this.modelState == null ? modelEntity.modelState == null : this.modelState.equals(modelEntity.modelState));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.id == null ? 0: this.id.hashCode());
    result = 31 * result + (this.created == null ? 0: this.created.hashCode());
    result = 31 * result + (this.updated == null ? 0: this.updated.hashCode());
    result = 31 * result + (this.modelType == null ? 0: this.modelType.hashCode());
    result = 31 * result + (this.deploymentId == null ? 0: this.deploymentId.hashCode());
    result = 31 * result + (this.name == null ? 0: this.name.hashCode());
    result = 31 * result + (this.scale == null ? 0: this.scale.hashCode());
    result = 31 * result + (this.fileLocation == null ? 0: this.fileLocation.hashCode());
    result = 31 * result + (this.state == null ? 0: this.state.hashCode());
    result = 31 * result + (this.jvmArgs == null ? 0: this.jvmArgs.hashCode());
    result = 31 * result + (this.subType == null ? 0: this.subType.hashCode());
    result = 31 * result + (this.labelsFileLocation == null ? 0: this.labelsFileLocation.hashCode());
    result = 31 * result + (this.extraArgs == null ? 0: this.extraArgs.hashCode());
    result = 31 * result + (this.launchPolicy == null ? 0: this.launchPolicy.hashCode());
    result = 31 * result + (this.modelState == null ? 0: this.modelState.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class ModelEntity {\n");
    
    sb.append("  id: ").append(id).append("\n");
    sb.append("  created: ").append(created).append("\n");
    sb.append("  updated: ").append(updated).append("\n");
    sb.append("  modelType: ").append(modelType).append("\n");
    sb.append("  deploymentId: ").append(deploymentId).append("\n");
    sb.append("  name: ").append(name).append("\n");
    sb.append("  scale: ").append(scale).append("\n");
    sb.append("  fileLocation: ").append(fileLocation).append("\n");
    sb.append("  state: ").append(state).append("\n");
    sb.append("  jvmArgs: ").append(jvmArgs).append("\n");
    sb.append("  subType: ").append(subType).append("\n");
    sb.append("  labelsFileLocation: ").append(labelsFileLocation).append("\n");
    sb.append("  extraArgs: ").append(extraArgs).append("\n");
    sb.append("  launchPolicy: ").append(launchPolicy).append("\n");
    sb.append("  modelState: ").append(modelState).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
