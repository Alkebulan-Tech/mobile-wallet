/*
 * Copyright 2024 Mifos Initiative
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at https://mozilla.org/MPL/2.0/.
 *
 * See https://github.com/openMF/mobile-wallet/blob/master/LICENSE.md
 */
package org.mifospay.core.network.model.entity

import kotlinx.serialization.Serializable

@Serializable
data class UserWithRole(
    val id: String? = null,
    val username: String? = null,
    val firstname: String? = null,
    val lastname: String? = null,
    val email: String? = null,
    val selectedRoles: List<Role>? = ArrayList(),
)
