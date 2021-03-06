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
    /// DeploymentObjects
    /// </summary>
    [DataContract]
    public partial class DeploymentObjects :  IEquatable<DeploymentObjects>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="DeploymentObjects" /> class.
        /// </summary>
        /// <param name="models">models.</param>
        /// <param name="transforms">transforms.</param>
        /// <param name="knn">knn.</param>
        public DeploymentObjects(List<ModelResponse> models = default(List<ModelResponse>), List<ModelResponse> transforms = default(List<ModelResponse>), List<ModelResponse> knn = default(List<ModelResponse>))
        {
            this.Models = models;
            this.Transforms = transforms;
            this.Knn = knn;
        }
        
        /// <summary>
        /// Gets or Sets Models
        /// </summary>
        [DataMember(Name="models", EmitDefaultValue=false)]
        public List<ModelResponse> Models { get; set; }

        /// <summary>
        /// Gets or Sets Transforms
        /// </summary>
        [DataMember(Name="transforms", EmitDefaultValue=false)]
        public List<ModelResponse> Transforms { get; set; }

        /// <summary>
        /// Gets or Sets Knn
        /// </summary>
        [DataMember(Name="knn", EmitDefaultValue=false)]
        public List<ModelResponse> Knn { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class DeploymentObjects {\n");
            sb.Append("  Models: ").Append(Models).Append("\n");
            sb.Append("  Transforms: ").Append(Transforms).Append("\n");
            sb.Append("  Knn: ").Append(Knn).Append("\n");
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
            return this.Equals(input as DeploymentObjects);
        }

        /// <summary>
        /// Returns true if DeploymentObjects instances are equal
        /// </summary>
        /// <param name="input">Instance of DeploymentObjects to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(DeploymentObjects input)
        {
            if (input == null)
                return false;

            return 
                (
                    this.Models == input.Models ||
                    this.Models != null &&
                    this.Models.SequenceEqual(input.Models)
                ) && 
                (
                    this.Transforms == input.Transforms ||
                    this.Transforms != null &&
                    this.Transforms.SequenceEqual(input.Transforms)
                ) && 
                (
                    this.Knn == input.Knn ||
                    this.Knn != null &&
                    this.Knn.SequenceEqual(input.Knn)
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
                if (this.Models != null)
                    hashCode = hashCode * 59 + this.Models.GetHashCode();
                if (this.Transforms != null)
                    hashCode = hashCode * 59 + this.Transforms.GetHashCode();
                if (this.Knn != null)
                    hashCode = hashCode * 59 + this.Knn.GetHashCode();
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
