/* 
 * Endpoints
 *
 * Endpoints API for different services in SKIL
 *
 * OpenAPI spec version: 1.2.0-rc1
 * 
 * Generated by: https://github.com/swagger-api/swagger-codegen.git
 */

using System;
using System.Linq;
using System.IO;
using System.Text;
using System.Text.RegularExpressions;
using System.Collections;
using System.Collections.Generic;
using System.Collections.ObjectModel;
using System.Runtime.Serialization;
using Newtonsoft.Json;
using Newtonsoft.Json.Converters;
using System.ComponentModel.DataAnnotations;
using SwaggerDateConverter = Skymind.Skil.Client.Client.SwaggerDateConverter;

namespace Skymind.Skil.Client.Model
{
    /// <summary>
    /// AddModelHistoryRequest
    /// </summary>
    [DataContract]
    public partial class AddModelHistoryRequest :  IEquatable<AddModelHistoryRequest>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="AddModelHistoryRequest" /> class.
        /// </summary>
        /// <param name="modelName">Name of the model history / workspace.</param>
        /// <param name="modelLabels">Model history / workspace labels.</param>
        public AddModelHistoryRequest(string modelName = default(string), string modelLabels = default(string))
        {
            this.ModelName = modelName;
            this.ModelLabels = modelLabels;
        }
        
        /// <summary>
        /// Name of the model history / workspace
        /// </summary>
        /// <value>Name of the model history / workspace</value>
        [DataMember(Name="modelName", EmitDefaultValue=false)]
        public string ModelName { get; set; }

        /// <summary>
        /// Model history / workspace labels
        /// </summary>
        /// <value>Model history / workspace labels</value>
        [DataMember(Name="modelLabels", EmitDefaultValue=false)]
        public string ModelLabels { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class AddModelHistoryRequest {\n");
            sb.Append("  ModelName: ").Append(ModelName).Append("\n");
            sb.Append("  ModelLabels: ").Append(ModelLabels).Append("\n");
            sb.Append("}\n");
            return sb.ToString();
        }
  
        /// <summary>
        /// Returns the JSON string presentation of the object
        /// </summary>
        /// <returns>JSON string presentation of the object</returns>
        public virtual string ToJson()
        {
            return JsonConvert.SerializeObject(this, Formatting.Indented);
        }

        /// <summary>
        /// Returns true if objects are equal
        /// </summary>
        /// <param name="input">Object to be compared</param>
        /// <returns>Boolean</returns>
        public override bool Equals(object input)
        {
            return this.Equals(input as AddModelHistoryRequest);
        }

        /// <summary>
        /// Returns true if AddModelHistoryRequest instances are equal
        /// </summary>
        /// <param name="input">Instance of AddModelHistoryRequest to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(AddModelHistoryRequest input)
        {
            if (input == null)
                return false;

            return 
                (
                    this.ModelName == input.ModelName ||
                    (this.ModelName != null &&
                    this.ModelName.Equals(input.ModelName))
                ) && 
                (
                    this.ModelLabels == input.ModelLabels ||
                    (this.ModelLabels != null &&
                    this.ModelLabels.Equals(input.ModelLabels))
                );
        }

        /// <summary>
        /// Gets the hash code
        /// </summary>
        /// <returns>Hash code</returns>
        public override int GetHashCode()
        {
            unchecked // Overflow is fine, just wrap
            {
                int hashCode = 41;
                if (this.ModelName != null)
                    hashCode = hashCode * 59 + this.ModelName.GetHashCode();
                if (this.ModelLabels != null)
                    hashCode = hashCode * 59 + this.ModelLabels.GetHashCode();
                return hashCode;
            }
        }

        /// <summary>
        /// To validate all properties of the instance
        /// </summary>
        /// <param name="validationContext">Validation context</param>
        /// <returns>Validation Result</returns>
        IEnumerable<System.ComponentModel.DataAnnotations.ValidationResult> IValidatableObject.Validate(ValidationContext validationContext)
        {
            yield break;
        }
    }

}