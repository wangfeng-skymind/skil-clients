=begin
#Predict

#Endpoints API for classification and other prediction services in SKIL

OpenAPI spec version: 1.0.3

Generated by: https://github.com/swagger-api/swagger-codegen.git
Swagger Codegen version: 2.3.1

=end

# Common files
require 'skil_client/api_client'
require 'skil_client/api_error'
require 'skil_client/version'
require 'skil_client/configuration'

# Models
require 'skil_client/models/base64_nd_array_body'
require 'skil_client/models/classification_result'
require 'skil_client/models/ind_array'
require 'skil_client/models/json_array_response'
require 'skil_client/models/log_batch'
require 'skil_client/models/log_request'
require 'skil_client/models/model_status'
require 'skil_client/models/multi_class_classification_result'
require 'skil_client/models/prediction'

# APIs
require 'skil_client/api/default_api'

module SkilCient
  class << self
    # Customize default settings for the SDK using block.
    #   SkilCient.configure do |config|
    #     config.username = "xxx"
    #     config.password = "xxx"
    #   end
    # If no block given, return the default Configuration object.
    def configure
      if block_given?
        yield(Configuration.default)
      else
        Configuration.default
      end
    end
  end
end
