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
    root.SkilClient.Prediction = factory(root.SkilClient.ApiClient, root.SkilClient.INDArray);
  }
}(this, function(ApiClient, INDArray) {
  'use strict';




  /**
   * The Prediction model module.
   * @module ai/skymind/skil/model/Prediction
   * @version 1.0.3-1
   */

  /**
   * Constructs a new <code>Prediction</code>.
   * @alias module:ai/skymind/skil/model/Prediction
   * @class
   */
  var exports = function() {
    var _this = this;




  };

  /**
   * Constructs a <code>Prediction</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:ai/skymind/skil/model/Prediction} obj Optional instance to populate.
   * @return {module:ai/skymind/skil/model/Prediction} The populated <code>Prediction</code> instance.
   */
  exports.constructFromObject = function(data, obj) {
    if (data) {
      obj = obj || new exports();

      if (data.hasOwnProperty('id')) {
        obj['id'] = ApiClient.convertToType(data['id'], 'String');
      }
      if (data.hasOwnProperty('needsPreProcessing')) {
        obj['needsPreProcessing'] = ApiClient.convertToType(data['needsPreProcessing'], 'Boolean');
      }
      if (data.hasOwnProperty('prediction')) {
        obj['prediction'] = INDArray.constructFromObject(data['prediction']);
      }
    }
    return obj;
  }

  /**
   * @member {String} id
   */
  exports.prototype['id'] = undefined;
  /**
   * @member {Boolean} needsPreProcessing
   */
  exports.prototype['needsPreProcessing'] = undefined;
  /**
   * @member {module:ai/skymind/skil/model/INDArray} prediction
   */
  exports.prototype['prediction'] = undefined;



  return exports;
}));


