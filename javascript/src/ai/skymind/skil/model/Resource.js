/**
 * Endpoints
 * Endpoints API for different services in SKIL
 *
 * OpenAPI spec version: 1.2.0-rc1
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 *
 * Swagger Codegen version: 2.4.0-SNAPSHOT
 *
 * Do not edit the class manually.
 *
 */

(function(root, factory) {
  if (typeof define === 'function' && define.amd) {
    // AMD. Register as an anonymous module.
    define(['ApiClient'], factory);
  } else if (typeof module === 'object' && module.exports) {
    // CommonJS-like environments that support module.exports, like Node.
    module.exports = factory(require('../ApiClient'));
  } else {
    // Browser globals (root is window)
    if (!root.SkilClient) {
      root.SkilClient = {};
    }
    root.SkilClient.Resource = factory(root.SkilClient.ApiClient);
  }
}(this, function(ApiClient) {
  'use strict';




  /**
   * The Resource model module.
   * @module ai/skymind/skil/model/Resource
   * @version 1.2.1.3
   */

  /**
   * Constructs a new <code>Resource</code>.
   * @alias module:ai/skymind/skil/model/Resource
   * @class
   */
  var exports = function() {
    var _this = this;






  };

  /**
   * Constructs a <code>Resource</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:ai/skymind/skil/model/Resource} obj Optional instance to populate.
   * @return {module:ai/skymind/skil/model/Resource} The populated <code>Resource</code> instance.
   */
  exports.constructFromObject = function(data, obj) {
    if (data) {
      obj = obj || new exports();

      if (data.hasOwnProperty('resourceId')) {
        obj['resourceId'] = ApiClient.convertToType(data['resourceId'], 'Number');
      }
      if (data.hasOwnProperty('name')) {
        obj['name'] = ApiClient.convertToType(data['name'], 'String');
      }
      if (data.hasOwnProperty('type')) {
        obj['type'] = ApiClient.convertToType(data['type'], 'String');
      }
      if (data.hasOwnProperty('subType')) {
        obj['subType'] = ApiClient.convertToType(data['subType'], 'String');
      }
      if (data.hasOwnProperty('credentialId')) {
        obj['credentialId'] = ApiClient.convertToType(data['credentialId'], 'String');
      }
    }
    return obj;
  }

  /**
   * ID of the resource
   * @member {Number} resourceId
   */
  exports.prototype['resourceId'] = undefined;
  /**
   * Resource nickname
   * @member {String} name
   */
  exports.prototype['name'] = undefined;
  /**
   * Resource type (whether COMPUTE or STORAGE)
   * @member {module:ai/skymind/skil/model/Resource.TypeEnum} type
   */
  exports.prototype['type'] = undefined;
  /**
   * Resource subtype (COMPUTE -> [EMR, DataProc, HDInsight, YARN] | STORAGE -> [S3, GoogleStorage, AzureStorage, HDFS])
   * @member {module:ai/skymind/skil/model/Resource.SubTypeEnum} subType
   */
  exports.prototype['subType'] = undefined;
  /**
   * Credentials GUID
   * @member {String} credentialId
   */
  exports.prototype['credentialId'] = undefined;


  /**
   * Allowed values for the <code>type</code> property.
   * @enum {String}
   * @readonly
   */
  exports.TypeEnum = {
    /**
     * value: "COMPUTE"
     * @const
     */
    "COMPUTE": "COMPUTE",
    /**
     * value: "STORAGE"
     * @const
     */
    "STORAGE": "STORAGE"  };

  /**
   * Allowed values for the <code>subType</code> property.
   * @enum {String}
   * @readonly
   */
  exports.SubTypeEnum = {
    /**
     * value: "EMR"
     * @const
     */
    "EMR": "EMR",
    /**
     * value: "S3"
     * @const
     */
    "S3": "S3",
    /**
     * value: "GoogleStorage"
     * @const
     */
    "GoogleStorage": "GoogleStorage",
    /**
     * value: "DataProc"
     * @const
     */
    "DataProc": "DataProc",
    /**
     * value: "HDInsight"
     * @const
     */
    "HDInsight": "HDInsight",
    /**
     * value: "AzureStorage"
     * @const
     */
    "AzureStorage": "AzureStorage",
    /**
     * value: "HDFS"
     * @const
     */
    "HDFS": "HDFS",
    /**
     * value: "YARN"
     * @const
     */
    "YARN": "YARN"  };


  return exports;
}));


