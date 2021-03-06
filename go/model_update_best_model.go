/*
 * Endpoints
 *
 * Endpoints API for different services in SKIL
 *
 * API version: 1.2.0-rc1
 * Generated by: Swagger Codegen (https://github.com/swagger-api/swagger-codegen.git)
 */

package skilclient

type UpdateBestModel struct {
	// GUID of the experiment to update.
	ExperimentId string `json:"experimentId,omitempty"`
	// GUID of the model to set as the best model.
	BestModelId string `json:"bestModelId,omitempty"`
}
