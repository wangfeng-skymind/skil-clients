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
    // AMD.
    define(['expect.js', '../../src/index'], factory);
  } else if (typeof module === 'object' && module.exports) {
    // CommonJS-like environments that support module.exports, like Node.
    factory(require('expect.js'), require('../../src/index'));
  } else {
    // Browser globals (root is window)
    factory(root.expect, root.SkilClient);
  }
}(this, function(expect, SkilClient) {
  'use strict';

  var instance;

  beforeEach(function() {
    instance = new SkilClient.LogBatch();
  });

  var getProperty = function(object, getter, property) {
    // Use getter method if present; otherwise, get the property directly.
    if (typeof object[getter] === 'function')
      return object[getter]();
    else
      return object[property];
  }

  var setProperty = function(object, setter, property, value) {
    // Use setter method if present; otherwise, set the property directly.
    if (typeof object[setter] === 'function')
      object[setter](value);
    else
      object[property] = value;
  }

  describe('LogBatch', function() {
    it('should create an instance of LogBatch', function() {
      // uncomment below and update the code to test LogBatch
      //var instane = new SkilClient.LogBatch();
      //expect(instance).to.be.a(SkilClient.LogBatch);
    });

    it('should have the property offset (base name: "offset")', function() {
      // uncomment below and update the code to test the property offset
      //var instane = new SkilClient.LogBatch();
      //expect(instance).to.be();
    });

    it('should have the property rowCount (base name: "rowCount")', function() {
      // uncomment below and update the code to test the property rowCount
      //var instane = new SkilClient.LogBatch();
      //expect(instance).to.be();
    });

    it('should have the property logs (base name: "logs")', function() {
      // uncomment below and update the code to test the property logs
      //var instane = new SkilClient.LogBatch();
      //expect(instance).to.be();
    });

  });

}));
