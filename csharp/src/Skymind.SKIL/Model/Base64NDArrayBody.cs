/* 
 * Predict
 *
 * Endpoints API for classification and other prediction services in SKIL
 *
 * OpenAPI spec version: 1.0.3
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
using SwaggerDateConverter = Skymind.SKIL.Client.SwaggerDateConverter;

namespace Skymind.SKIL.Model
{
    /// <summary>
    /// Base64NDArrayBody
    /// </summary>
    [DataContract]
    public partial class Base64NDArrayBody :  IEquatable<Base64NDArrayBody>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="Base64NDArrayBody" /> class.
        /// </summary>
        /// <param name="Ndarray">Ndarray.</param>
        public Base64NDArrayBody(string Ndarray = default(string))
        {
            this.Ndarray = Ndarray;
        }
        
        /// <summary>
        /// Gets or Sets Ndarray
        /// </summary>
        [DataMember(Name="ndarray", EmitDefaultValue=false)]
        public string Ndarray { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class Base64NDArrayBody {\n");
            sb.Append("  Ndarray: ").Append(Ndarray).Append("\n");
            sb.Append("}\n");
            return sb.ToString();
        }
  
        /// <summary>
        /// Returns the JSON string presentation of the object
        /// </summary>
        /// <returns>JSON string presentation of the object</returns>
        public string ToJson()
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
            return this.Equals(input as Base64NDArrayBody);
        }

        /// <summary>
        /// Returns true if Base64NDArrayBody instances are equal
        /// </summary>
        /// <param name="input">Instance of Base64NDArrayBody to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(Base64NDArrayBody input)
        {
            if (input == null)
                return false;

            return 
                (
                    this.Ndarray == input.Ndarray ||
                    (this.Ndarray != null &&
                    this.Ndarray.Equals(input.Ndarray))
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
                if (this.Ndarray != null)
                    hashCode = hashCode * 59 + this.Ndarray.GetHashCode();
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