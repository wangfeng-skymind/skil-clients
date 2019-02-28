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
    root.SkilClient.FileUpload = factory(root.SkilClient.ApiClient);
  }
}(this, function(ApiClient) {
  'use strict';




  /**
   * The FileUpload model module.
   * @module ai/skymind/skil/model/FileUpload
   * @version 1.2.1.3
   */

  /**
   * Constructs a new <code>FileUpload</code>.
   * @alias module:ai/skymind/skil/model/FileUpload
   * @class
   */
  var exports = function() {
    var _this = this;







  };

  /**
   * Constructs a <code>FileUpload</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:ai/skymind/skil/model/FileUpload} obj Optional instance to populate.
   * @return {module:ai/skymind/skil/model/FileUpload} The populated <code>FileUpload</code> instance.
   */
  exports.constructFromObject = function(data, obj) {
    if (data) {
      obj = obj || new exports();

      if (data.hasOwnProperty('key')) {
        obj['key'] = ApiClient.convertToType(data['key'], 'String');
      }
      if (data.hasOwnProperty('fileName')) {
        obj['fileName'] = ApiClient.convertToType(data['fileName'], 'String');
      }
      if (data.hasOwnProperty('status')) {
        obj['status'] = ApiClient.convertToType(data['status'], 'String');
      }
      if (data.hasOwnProperty('type')) {
        obj['type'] = ApiClient.convertToType(data['type'], 'String');
      }
      if (data.hasOwnProperty('path')) {
        obj['path'] = ApiClient.convertToType(data['path'], 'String');
      }
      if (data.hasOwnProperty('fileContent')) {
        obj['fileContent'] = ApiClient.convertToType(data['fileContent'], 'String');
      }
    }
    return obj;
  }

  /**
   * @member {String} key
   */
  exports.prototype['key'] = undefined;
  /**
   * @member {String} fileName
   */
  exports.prototype['fileName'] = undefined;
  /**
   * @member {String} status
   */
  exports.prototype['status'] = undefined;
  /**
   * @member {String} type
   */
  exports.prototype['type'] = undefined;
  /**
   * @member {String} path
   */
  exports.prototype['path'] = undefined;
  /**
   * @member {String} fileContent
   */
  exports.prototype['fileContent'] = undefined;



  return exports;
}));


