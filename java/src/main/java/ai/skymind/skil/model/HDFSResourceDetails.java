/*
 * Endpoints
 * Endpoints API for different services in SKIL
 *
 * OpenAPI spec version: 1.2.0-beta
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
 * HDFSResourceDetails
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-10-17T08:50:23.609+05:00")
public class HDFSResourceDetails {
  @SerializedName("resourceId")
  private Long resourceId = null;

  /**
   * Resource type
   */
  @JsonAdapter(TypeEnum.Adapter.class)
  public enum TypeEnum {
    STORAGE("STORAGE");

    private String value;

    TypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static TypeEnum fromValue(String text) {
      for (TypeEnum b : TypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<TypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final TypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public TypeEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return TypeEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("type")
  private TypeEnum type = null;

  /**
   * Resource subtype
   */
  @JsonAdapter(SubTypeEnum.Adapter.class)
  public enum SubTypeEnum {
    HDFS("HDFS");

    private String value;

    SubTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static SubTypeEnum fromValue(String text) {
      for (SubTypeEnum b : SubTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<SubTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final SubTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public SubTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return SubTypeEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("subType")
  private SubTypeEnum subType = null;

  @SerializedName("nameNodeHost")
  private String nameNodeHost = null;

  @SerializedName("nameNodePort")
  private String nameNodePort = null;

  public HDFSResourceDetails resourceId(Long resourceId) {
    this.resourceId = resourceId;
    return this;
  }

   /**
   * ID of the resource
   * @return resourceId
  **/
  @ApiModelProperty(value = "ID of the resource")
  public Long getResourceId() {
    return resourceId;
  }

  public void setResourceId(Long resourceId) {
    this.resourceId = resourceId;
  }

  public HDFSResourceDetails type(TypeEnum type) {
    this.type = type;
    return this;
  }

   /**
   * Resource type
   * @return type
  **/
  @ApiModelProperty(value = "Resource type")
  public TypeEnum getType() {
    return type;
  }

  public void setType(TypeEnum type) {
    this.type = type;
  }

  public HDFSResourceDetails subType(SubTypeEnum subType) {
    this.subType = subType;
    return this;
  }

   /**
   * Resource subtype
   * @return subType
  **/
  @ApiModelProperty(value = "Resource subtype")
  public SubTypeEnum getSubType() {
    return subType;
  }

  public void setSubType(SubTypeEnum subType) {
    this.subType = subType;
  }

  public HDFSResourceDetails nameNodeHost(String nameNodeHost) {
    this.nameNodeHost = nameNodeHost;
    return this;
  }

   /**
   * Host of the node running the NameNode
   * @return nameNodeHost
  **/
  @ApiModelProperty(value = "Host of the node running the NameNode")
  public String getNameNodeHost() {
    return nameNodeHost;
  }

  public void setNameNodeHost(String nameNodeHost) {
    this.nameNodeHost = nameNodeHost;
  }

  public HDFSResourceDetails nameNodePort(String nameNodePort) {
    this.nameNodePort = nameNodePort;
    return this;
  }

   /**
   * Port of the node running the NameNode
   * @return nameNodePort
  **/
  @ApiModelProperty(value = "Port of the node running the NameNode")
  public String getNameNodePort() {
    return nameNodePort;
  }

  public void setNameNodePort(String nameNodePort) {
    this.nameNodePort = nameNodePort;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    HDFSResourceDetails hdFSResourceDetails = (HDFSResourceDetails) o;
    return Objects.equals(this.resourceId, hdFSResourceDetails.resourceId) &&
        Objects.equals(this.type, hdFSResourceDetails.type) &&
        Objects.equals(this.subType, hdFSResourceDetails.subType) &&
        Objects.equals(this.nameNodeHost, hdFSResourceDetails.nameNodeHost) &&
        Objects.equals(this.nameNodePort, hdFSResourceDetails.nameNodePort);
  }

  @Override
  public int hashCode() {
    return Objects.hash(resourceId, type, subType, nameNodeHost, nameNodePort);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HDFSResourceDetails {\n");
    
    sb.append("    resourceId: ").append(toIndentedString(resourceId)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    subType: ").append(toIndentedString(subType)).append("\n");
    sb.append("    nameNodeHost: ").append(toIndentedString(nameNodeHost)).append("\n");
    sb.append("    nameNodePort: ").append(toIndentedString(nameNodePort)).append("\n");
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

