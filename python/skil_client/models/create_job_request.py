# coding: utf-8

"""
    Endpoints

    Endpoints API for different services in SKIL  # noqa: E501

    OpenAPI spec version: 1.2.0-rc1
    
    Generated by: https://github.com/swagger-api/swagger-codegen.git
"""


import pprint
import re  # noqa: F401

import six


class CreateJobRequest(object):
    """NOTE: This class is auto generated by the swagger code generator program.

    Do not edit the class manually.
    """

    """
    Attributes:
      swagger_types (dict): The key is attribute name
                            and the value is attribute type.
      attribute_map (dict): The key is attribute name
                            and the value is json key in definition.
    """
    swagger_types = {
        'compute_resource_id': 'int',
        'storage_resource_id': 'int',
        'job_args': 'str',
        'output_file_name': 'str'
    }

    attribute_map = {
        'compute_resource_id': 'computeResourceId',
        'storage_resource_id': 'storageResourceId',
        'job_args': 'jobArgs',
        'output_file_name': 'outputFileName'
    }

    def __init__(self, compute_resource_id=None, storage_resource_id=None, job_args=None, output_file_name=None):  # noqa: E501
        """CreateJobRequest - a model defined in Swagger"""  # noqa: E501

        self._compute_resource_id = None
        self._storage_resource_id = None
        self._job_args = None
        self._output_file_name = None
        self.discriminator = None

        if compute_resource_id is not None:
            self.compute_resource_id = compute_resource_id
        if storage_resource_id is not None:
            self.storage_resource_id = storage_resource_id
        if job_args is not None:
            self.job_args = job_args
        if output_file_name is not None:
            self.output_file_name = output_file_name

    @property
    def compute_resource_id(self):
        """Gets the compute_resource_id of this CreateJobRequest.  # noqa: E501

        Compute resource ID  # noqa: E501

        :return: The compute_resource_id of this CreateJobRequest.  # noqa: E501
        :rtype: int
        """
        return self._compute_resource_id

    @compute_resource_id.setter
    def compute_resource_id(self, compute_resource_id):
        """Sets the compute_resource_id of this CreateJobRequest.

        Compute resource ID  # noqa: E501

        :param compute_resource_id: The compute_resource_id of this CreateJobRequest.  # noqa: E501
        :type: int
        """

        self._compute_resource_id = compute_resource_id

    @property
    def storage_resource_id(self):
        """Gets the storage_resource_id of this CreateJobRequest.  # noqa: E501

        Storage resource ID  # noqa: E501

        :return: The storage_resource_id of this CreateJobRequest.  # noqa: E501
        :rtype: int
        """
        return self._storage_resource_id

    @storage_resource_id.setter
    def storage_resource_id(self, storage_resource_id):
        """Sets the storage_resource_id of this CreateJobRequest.

        Storage resource ID  # noqa: E501

        :param storage_resource_id: The storage_resource_id of this CreateJobRequest.  # noqa: E501
        :type: int
        """

        self._storage_resource_id = storage_resource_id

    @property
    def job_args(self):
        """Gets the job_args of this CreateJobRequest.  # noqa: E501

        Job arguments  # noqa: E501

        :return: The job_args of this CreateJobRequest.  # noqa: E501
        :rtype: str
        """
        return self._job_args

    @job_args.setter
    def job_args(self, job_args):
        """Sets the job_args of this CreateJobRequest.

        Job arguments  # noqa: E501

        :param job_args: The job_args of this CreateJobRequest.  # noqa: E501
        :type: str
        """

        self._job_args = job_args

    @property
    def output_file_name(self):
        """Gets the output_file_name of this CreateJobRequest.  # noqa: E501

        Output file name  # noqa: E501

        :return: The output_file_name of this CreateJobRequest.  # noqa: E501
        :rtype: str
        """
        return self._output_file_name

    @output_file_name.setter
    def output_file_name(self, output_file_name):
        """Sets the output_file_name of this CreateJobRequest.

        Output file name  # noqa: E501

        :param output_file_name: The output_file_name of this CreateJobRequest.  # noqa: E501
        :type: str
        """

        self._output_file_name = output_file_name

    def to_dict(self):
        """Returns the model properties as a dict"""
        result = {}

        for attr, _ in six.iteritems(self.swagger_types):
            value = getattr(self, attr)
            if isinstance(value, list):
                result[attr] = list(map(
                    lambda x: x.to_dict() if hasattr(x, "to_dict") else x,
                    value
                ))
            elif hasattr(value, "to_dict"):
                result[attr] = value.to_dict()
            elif isinstance(value, dict):
                result[attr] = dict(map(
                    lambda item: (item[0], item[1].to_dict())
                    if hasattr(item[1], "to_dict") else item,
                    value.items()
                ))
            else:
                result[attr] = value

        return result

    def to_str(self):
        """Returns the string representation of the model"""
        return pprint.pformat(self.to_dict())

    def __repr__(self):
        """For `print` and `pprint`"""
        return self.to_str()

    def __eq__(self, other):
        """Returns true if both objects are equal"""
        if not isinstance(other, CreateJobRequest):
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        """Returns true if both objects are not equal"""
        return not self == other
