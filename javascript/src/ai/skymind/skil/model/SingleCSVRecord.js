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
    root.SkilClient.SingleCSVRecord = factory(root.SkilClient.ApiClient);
  }
}(this, function(ApiClient) {
  'use strict';




  /**
   * The SingleCSVRecord model module.
   * @module ai/skymind/skil/model/SingleCSVRecord
   * @version 1.2.1.3
   */

  /**
   * Constructs a new <code>SingleCSVRecord</code>.
   * @alias module:ai/skymind/skil/model/SingleCSVRecord
   * @class
   */
  var exports = function() {
    var _this = this;


  };

  /**
   * Constructs a <code>SingleCSVRecord</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:ai/skymind/skil/model/SingleCSVRecord} obj Optional instance to populate.
   * @return {module:ai/skymind/skil/model/SingleCSVRecord} The populated <code>SingleCSVRecord</code> instance.
   */
  exports.constructFromObject = function(data, obj) {
    if (data) {
      obj = obj || new exports();

      if (data.hasOwnProperty('values')) {
        obj['values'] = ApiClient.convertToType(data['values'], ['String']);
      }
    }
    return obj;
  }

  /**
   * @member {Array.<String>} values
   */
  exports.prototype['values'] = undefined;



  return exports;
}));


