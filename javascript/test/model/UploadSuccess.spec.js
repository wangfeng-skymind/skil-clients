/**
 * Predict
 * Endpoints API for classification and other prediction services in SKIL
 *
 * OpenAPI spec version: 1.1.0-beta
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
    instance = new SkilClient.UploadSuccess();
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

  describe('UploadSuccess', function() {
    it('should create an instance of UploadSuccess', function() {
      // uncomment below and update the code to test UploadSuccess
      //var instane = new SkilClient.UploadSuccess();
      //expect(instance).to.be.a(SkilClient.UploadSuccess);
    });

    it('should have the property key (base name: "key")', function() {
      // uncomment below and update the code to test the property key
      //var instane = new SkilClient.UploadSuccess();
      //expect(instance).to.be();
    });

    it('should have the property fileName (base name: "fileName")', function() {
      // uncomment below and update the code to test the property fileName
      //var instane = new SkilClient.UploadSuccess();
      //expect(instance).to.be();
    });

    it('should have the property status (base name: "status")', function() {
      // uncomment below and update the code to test the property status
      //var instane = new SkilClient.UploadSuccess();
      //expect(instance).to.be();
    });

    it('should have the property type (base name: "type")', function() {
      // uncomment below and update the code to test the property type
      //var instane = new SkilClient.UploadSuccess();
      //expect(instance).to.be();
    });

    it('should have the property path (base name: "path")', function() {
      // uncomment below and update the code to test the property path
      //var instane = new SkilClient.UploadSuccess();
      //expect(instance).to.be();
    });

    it('should have the property fileContent (base name: "fileContent")', function() {
      // uncomment below and update the code to test the property fileContent
      //var instane = new SkilClient.UploadSuccess();
      //expect(instance).to.be();
    });

  });

}));