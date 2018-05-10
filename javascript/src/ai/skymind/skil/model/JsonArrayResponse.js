/**
 * Predict
 * Endpoints API for classification and other prediction services in SKIL
 *
 * OpenAPI spec version: 1.0.3
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 *
 * Swagger Codegen version: 2.3.1
 *
 * Do not edit the class manually.
 *
 */

(function(root, factory) {
  if (typeof define === 'function' && define.amd) {
    // AMD. Register as an anonymous module.
    define(['ApiClient', 'ai/skymind/skil/model/INDArray'], factory);
  } else if (typeof module === 'object' && module.exports) {
    // CommonJS-like environments that support module.exports, like Node.
    module.exports = factory(require('../ApiClient'), require('./INDArray'));
  } else {
    // Browser globals (root is window)
    if (!root.SkilClient) {
      root.SkilClient = {};
    }
    root.SkilClient.JsonArrayResponse = factory(root.SkilClient.ApiClient, root.SkilClient.INDArray);
  }
}(this, function(ApiClient, INDArray) {
  'use strict';




  /**
   * The JsonArrayResponse model module.
   * @module ai/skymind/skil/model/JsonArrayResponse
   * @version 1.0.3-1
   */

  /**
   * Constructs a new <code>JsonArrayResponse</code>.
   * @alias module:ai/skymind/skil/model/JsonArrayResponse
   * @class
   */
  var exports = function() {
    var _this = this;


  };

  /**
   * Constructs a <code>JsonArrayResponse</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:ai/skymind/skil/model/JsonArrayResponse} obj Optional instance to populate.
   * @return {module:ai/skymind/skil/model/JsonArrayResponse} The populated <code>JsonArrayResponse</code> instance.
   */
  exports.constructFromObject = function(data, obj) {
    if (data) {
      obj = obj || new exports();

      if (data.hasOwnProperty('array')) {
        obj['array'] = INDArray.constructFromObject(data['array']);
      }
    }
    return obj;
  }

  /**
   * @member {module:ai/skymind/skil/model/INDArray} array
   */
  exports.prototype['array'] = undefined;



  return exports;
}));

