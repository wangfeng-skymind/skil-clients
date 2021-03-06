//
// User.swift
//
// Generated by swagger-codegen
// https://github.com/swagger-api/swagger-codegen
//

import Foundation


open class User: JSONEncodable {

    public var userId: String?
    public var userName: String?
    public var password: String?
    /** User&#39;s role such as [user, admin, trial] */
    public var role: String?
    /** User&#39;s scope such as [all, skil, zeppelin] */
    public var scope: String?

    public init() {}

    // MARK: JSONEncodable
    open func encodeToJSON() -> Any {
        var nillableDictionary = [String:Any?]()
        nillableDictionary["userId"] = self.userId
        nillableDictionary["userName"] = self.userName
        nillableDictionary["password"] = self.password
        nillableDictionary["role"] = self.role
        nillableDictionary["scope"] = self.scope

        let dictionary: [String:Any] = APIHelper.rejectNil(nillableDictionary) ?? [:]
        return dictionary
    }
}

