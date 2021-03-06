//
// NearestNeighborRequest.swift
//
// Generated by swagger-codegen
// https://github.com/swagger-api/swagger-codegen
//

import Foundation


open class NearestNeighborRequest: JSONEncodable {

    /** the number of results */
    public var k: Int32?
    /** the index of the EXISTING ndarray to run a search on */
    public var inputIndex: Int32?

    public init() {}

    // MARK: JSONEncodable
    open func encodeToJSON() -> Any {
        var nillableDictionary = [String:Any?]()
        nillableDictionary["k"] = self.k?.encodeToJSON()
        nillableDictionary["inputIndex"] = self.inputIndex?.encodeToJSON()

        let dictionary: [String:Any] = APIHelper.rejectNil(nillableDictionary) ?? [:]
        return dictionary
    }
}

