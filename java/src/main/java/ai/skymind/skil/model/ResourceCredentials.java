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
 * ResourceCredentials
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-01-28T12:07:08.111+05:00")
public class ResourceCredentials {
  @SerializedName("credentialId")
  private Long credentialId = null;

  /**
   * Type of the credentials
   */
  @JsonAdapter(TypeEnum.Adapter.class)
  public enum TypeEnum {
    AWS("AWS"),
    
    AZURE("Azure"),
    
    GOOGLECLOUD("GoogleCloud"),
    
    HADOOP("Hadoop");

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

  @SerializedName("name")
  private String name = null;

  @SerializedName("uri")
  private String uri = null;

  public ResourceCredentials credentialId(Long credentialId) {
    this.credentialId = credentialId;
    return this;
  }

   /**
   * ID of the credentials
   * @return credentialId
  **/
  @ApiModelProperty(value = "ID of the credentials")
  public Long getCredentialId() {
    return credentialId;
  }

  public void setCredentialId(Long credentialId) {
    this.credentialId = credentialId;
  }

  public ResourceCredentials type(TypeEnum type) {
    this.type = type;
    return this;
  }

   /**
   * Type of the credentials
   * @return type
  **/
  @ApiModelProperty(value = "Type of the credentials")
  public TypeEnum getType() {
    return type;
  }

  public void setType(TypeEnum type) {
    this.type = type;
  }

  public ResourceCredentials name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Name of the credentials
   * @return name
  **/
  @ApiModelProperty(value = "Name of the credentials")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public ResourceCredentials uri(String uri) {
    this.uri = uri;
    return this;
  }

   /**
   * URI of the credentials
   * @return uri
  **/
  @ApiModelProperty(value = "URI of the credentials")
  public String getUri() {
    return uri;
  }

  public void setUri(String uri) {
    this.uri = uri;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ResourceCredentials resourceCredentials = (ResourceCredentials) o;
    return Objects.equals(this.credentialId, resourceCredentials.credentialId) &&
        Objects.equals(this.type, resourceCredentials.type) &&
        Objects.equals(this.name, resourceCredentials.name) &&
        Objects.equals(this.uri, resourceCredentials.uri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(credentialId, type, name, uri);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResourceCredentials {\n");
    
    sb.append("    credentialId: ").append(toIndentedString(credentialId)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    uri: ").append(toIndentedString(uri)).append("\n");
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

