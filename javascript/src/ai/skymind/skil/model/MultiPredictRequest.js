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
    define(['ApiClient', 'ai/skymind/skil/model/INDArray'], factory);
  } else if (typeof module === 'object' && module.exports) {
    // CommonJS-like environments that support module.exports, like Node.
    module.exports = factory(require('../ApiClient'), require('./INDArray'));
  } else {
    // Browser globals (root is window)
    if (!root.SkilClient) {
      root.SkilClient = {};
    }
    root.SkilClient.MultiPredictRequest = factory(root.SkilClient.ApiClient, root.SkilClient.INDArray);
  }
}(this, function(ApiClient, INDArray) {
  'use strict';




  /**
   * The MultiPredictRequest model module.
   * @module ai/skymind/skil/model/MultiPredictRequest
   * @version 1.2.1.3
   */

  /**
   * Constructs a new <code>MultiPredictRequest</code>.
   * @alias module:ai/skymind/skil/model/MultiPredictRequest
   * @class
   */
  var exports = function() {
    var _this = this;





  };

  /**
   * Constructs a <code>MultiPredictRequest</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:ai/skymind/skil/model/MultiPredictRequest} obj Optional instance to populate.
   * @return {module:ai/skymind/skil/model/MultiPredictRequest} The populated <code>MultiPredictRequest</code> instance.
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
      if (data.hasOwnProperty('inputs')) {
        obj['inputs'] = ApiClient.convertToType(data['inputs'], [INDArray]);
      }
      if (data.hasOwnProperty('inputMasks')) {
        obj['inputMasks'] = ApiClient.convertToType(data['inputMasks'], [INDArray]);
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
   * @member {Array.<module:ai/skymind/skil/model/INDArray>} inputs
   */
  exports.prototype['inputs'] = undefined;
  /**
   * @member {Array.<module:ai/skymind/skil/model/INDArray>} inputMasks
   */
  exports.prototype['inputMasks'] = undefined;



  return exports;
}));


