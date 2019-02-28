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
public class Token implements Serializable {
  
  @SerializedName("tokenId")
  private Long tokenId = null;
  @SerializedName("issued")
  private Long issued = null;
  @SerializedName("expire")
  private Long expire = null;
  @SerializedName("token")
  private String token = null;
  @SerializedName("userId")
  private String userId = null;
  @SerializedName("isRevoked")
  private Integer isRevoked = null;

  /**
   **/
  @ApiModelProperty(value = "")
  public Long getTokenId() {
    return tokenId;
  }
  public void setTokenId(Long tokenId) {
    this.tokenId = tokenId;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Long getIssued() {
    return issued;
  }
  public void setIssued(Long issued) {
    this.issued = issued;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Long getExpire() {
    return expire;
  }
  public void setExpire(Long expire) {
    this.expire = expire;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getToken() {
    return token;
  }
  public void setToken(String token) {
    this.token = token;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getUserId() {
    return userId;
  }
  public void setUserId(String userId) {
    this.userId = userId;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Integer getIsRevoked() {
    return isRevoked;
  }
  public void setIsRevoked(Integer isRevoked) {
    this.isRevoked = isRevoked;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Token token = (Token) o;
    return (this.tokenId == null ? token.tokenId == null : this.tokenId.equals(token.tokenId)) &&
        (this.issued == null ? token.issued == null : this.issued.equals(token.issued)) &&
        (this.expire == null ? token.expire == null : this.expire.equals(token.expire)) &&
        (this.token == null ? token.token == null : this.token.equals(token.token)) &&
        (this.userId == null ? token.userId == null : this.userId.equals(token.userId)) &&
        (this.isRevoked == null ? token.isRevoked == null : this.isRevoked.equals(token.isRevoked));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.tokenId == null ? 0: this.tokenId.hashCode());
    result = 31 * result + (this.issued == null ? 0: this.issued.hashCode());
    result = 31 * result + (this.expire == null ? 0: this.expire.hashCode());
    result = 31 * result + (this.token == null ? 0: this.token.hashCode());
    result = 31 * result + (this.userId == null ? 0: this.userId.hashCode());
    result = 31 * result + (this.isRevoked == null ? 0: this.isRevoked.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class Token {\n");
    
    sb.append("  tokenId: ").append(tokenId).append("\n");
    sb.append("  issued: ").append(issued).append("\n");
    sb.append("  expire: ").append(expire).append("\n");
    sb.append("  token: ").append(token).append("\n");
    sb.append("  userId: ").append(userId).append("\n");
    sb.append("  isRevoked: ").append(isRevoked).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}