=begin
#Predict

#Endpoints API for classification and other prediction services in SKIL

OpenAPI spec version: 1.0.3

Generated by: https://github.com/swagger-api/swagger-codegen.git
Swagger Codegen version: 2.3.1

=end

require 'spec_helper'
require 'json'
require 'date'

# Unit tests for SkilCient::MultiClassClassificationResult
# Automatically generated by swagger-codegen (github.com/swagger-api/swagger-codegen)
# Please update as you see appropriate
describe 'MultiClassClassificationResult' do
  before do
    # run before each test
    @instance = SkilCient::MultiClassClassificationResult.new
  end

  after do
    # run after each test
  end

  describe 'test an instance of MultiClassClassificationResult' do
    it 'should create an instance of MultiClassClassificationResult' do
      expect(@instance).to be_instance_of(SkilCient::MultiClassClassificationResult)
    end
  end
  describe 'test attribute "ranked_outcomes"' do
    it 'should work' do
       # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  describe 'test attribute "max_outcomes"' do
    it 'should work' do
       # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  describe 'test attribute "probabilities"' do
    it 'should work' do
       # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

end

