//
// MultiClassClassificationResult.swift
//
// Generated by swagger-codegen
// https://github.com/swagger-api/swagger-codegen
//

import Foundation


/** Represents all of the labels for a given classification */
open class MultiClassClassificationResult: JSONEncodable {

    public var rankedOutcomes: [[String]]?
    public var maxOutcomes: [String]?
    public var probabilities: [[Double]]?

    public init() {}

    // MARK: JSONEncodable
    open func encodeToJSON() -> Any {
        var nillableDictionary = [String:Any?]()
        nillableDictionary["rankedOutcomes"] = self.rankedOutcomes?.encodeToJSON()
        nillableDictionary["maxOutcomes"] = self.maxOutcomes?.encodeToJSON()
        nillableDictionary["probabilities"] = self.probabilities?.encodeToJSON()

        let dictionary: [String:Any] = APIHelper.rejectNil(nillableDictionary) ?? [:]
        return dictionary
    }
}

