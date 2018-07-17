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
import java.util.ArrayList;
import java.util.List;

/**
 * INDArray
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-07-17T18:29:30.949+05:00")
public class INDArray {
  @SerializedName("array")
  private String array = null;

  @SerializedName("shape")
  private List<Integer> shape = null;

  /**
   * Gets or Sets ordering
   */
  @JsonAdapter(OrderingEnum.Adapter.class)
  public enum OrderingEnum {
    F("f"),
    
    C("c");

    private String value;

    OrderingEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static OrderingEnum fromValue(String text) {
      for (OrderingEnum b : OrderingEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<OrderingEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final OrderingEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public OrderingEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return OrderingEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("ordering")
  private OrderingEnum ordering = null;

  @SerializedName("data")
  private List<Float> data = null;

  /**
   * Gets or Sets dataType
   */
  @JsonAdapter(DataTypeEnum.Adapter.class)
  public enum DataTypeEnum {
    INT8("INT8"),
    
    UINT8("UINT8"),
    
    INT16("INT16"),
    
    FLOAT16("FLOAT16");

    private String value;

    DataTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static DataTypeEnum fromValue(String text) {
      for (DataTypeEnum b : DataTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<DataTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final DataTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public DataTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return DataTypeEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("dataType")
  private DataTypeEnum dataType = null;

  public INDArray array(String array) {
    this.array = array;
    return this;
  }

   /**
   * Get array
   * @return array
  **/
  @ApiModelProperty(value = "")
  public String getArray() {
    return array;
  }

  public void setArray(String array) {
    this.array = array;
  }

  public INDArray shape(List<Integer> shape) {
    this.shape = shape;
    return this;
  }

  public INDArray addShapeItem(Integer shapeItem) {
    if (this.shape == null) {
      this.shape = new ArrayList<Integer>();
    }
    this.shape.add(shapeItem);
    return this;
  }

   /**
   * Get shape
   * @return shape
  **/
  @ApiModelProperty(value = "")
  public List<Integer> getShape() {
    return shape;
  }

  public void setShape(List<Integer> shape) {
    this.shape = shape;
  }

  public INDArray ordering(OrderingEnum ordering) {
    this.ordering = ordering;
    return this;
  }

   /**
   * Get ordering
   * @return ordering
  **/
  @ApiModelProperty(value = "")
  public OrderingEnum getOrdering() {
    return ordering;
  }

  public void setOrdering(OrderingEnum ordering) {
    this.ordering = ordering;
  }

  public INDArray data(List<Float> data) {
    this.data = data;
    return this;
  }

  public INDArray addDataItem(Float dataItem) {
    if (this.data == null) {
      this.data = new ArrayList<Float>();
    }
    this.data.add(dataItem);
    return this;
  }

   /**
   * Get data
   * @return data
  **/
  @ApiModelProperty(value = "")
  public List<Float> getData() {
    return data;
  }

  public void setData(List<Float> data) {
    this.data = data;
  }

  public INDArray dataType(DataTypeEnum dataType) {
    this.dataType = dataType;
    return this;
  }

   /**
   * Get dataType
   * @return dataType
  **/
  @ApiModelProperty(value = "")
  public DataTypeEnum getDataType() {
    return dataType;
  }

  public void setDataType(DataTypeEnum dataType) {
    this.dataType = dataType;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    INDArray inDArray = (INDArray) o;
    return Objects.equals(this.array, inDArray.array) &&
        Objects.equals(this.shape, inDArray.shape) &&
        Objects.equals(this.ordering, inDArray.ordering) &&
        Objects.equals(this.data, inDArray.data) &&
        Objects.equals(this.dataType, inDArray.dataType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(array, shape, ordering, data, dataType);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class INDArray {\n");
    
    sb.append("    array: ").append(toIndentedString(array)).append("\n");
    sb.append("    shape: ").append(toIndentedString(shape)).append("\n");
    sb.append("    ordering: ").append(toIndentedString(ordering)).append("\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
    sb.append("    dataType: ").append(toIndentedString(dataType)).append("\n");
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

