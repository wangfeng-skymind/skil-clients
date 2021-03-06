/* 
 * Endpoints
 *
 * Endpoints API for different services in SKIL
 *
 * OpenAPI spec version: 1.2.0-rc1
 * 
 * Generated by: https://github.com/swagger-api/swagger-codegen.git
 */


#[allow(unused_imports)]
use serde_json::Value;

#[derive(Debug, Serialize, Deserialize)]
pub struct BestModel {
  /// the list of GUIDs for the models to get the best model from
  #[serde(rename = "ids")]
  ids: Option<Vec<String>>,
  /// Name of the column metric (in an evaluation result) to get the best model from.
  #[serde(rename = "columnNameMetric")]
  column_name_metric: Option<String>,
  /// the evaluation type to aggregate for each model's revisions
  #[serde(rename = "evalType")]
  eval_type: Option<String>
}

impl BestModel {
  pub fn new() -> BestModel {
    BestModel {
      ids: None,
      column_name_metric: None,
      eval_type: None
    }
  }

  pub fn set_ids(&mut self, ids: Vec<String>) {
    self.ids = Some(ids);
  }

  pub fn with_ids(mut self, ids: Vec<String>) -> BestModel {
    self.ids = Some(ids);
    self
  }

  pub fn ids(&self) -> Option<&Vec<String>> {
    self.ids.as_ref()
  }

  pub fn reset_ids(&mut self) {
    self.ids = None;
  }

  pub fn set_column_name_metric(&mut self, column_name_metric: String) {
    self.column_name_metric = Some(column_name_metric);
  }

  pub fn with_column_name_metric(mut self, column_name_metric: String) -> BestModel {
    self.column_name_metric = Some(column_name_metric);
    self
  }

  pub fn column_name_metric(&self) -> Option<&String> {
    self.column_name_metric.as_ref()
  }

  pub fn reset_column_name_metric(&mut self) {
    self.column_name_metric = None;
  }

  pub fn set_eval_type(&mut self, eval_type: String) {
    self.eval_type = Some(eval_type);
  }

  pub fn with_eval_type(mut self, eval_type: String) -> BestModel {
    self.eval_type = Some(eval_type);
    self
  }

  pub fn eval_type(&self) -> Option<&String> {
    self.eval_type.as_ref()
  }

  pub fn reset_eval_type(&mut self) {
    self.eval_type = None;
  }

}



