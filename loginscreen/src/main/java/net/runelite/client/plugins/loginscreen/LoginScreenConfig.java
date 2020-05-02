/*
 * Copyright (c) 2017, Seth <Sethtroll3@gmail.com>
 * All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are met:
 *
 * 1. Redistributions of source code must retain the above copyright notice, this
 *    list of conditions and the following disclaimer.
 * 2. Redistributions in binary form must reproduce the above copyright notice,
 *    this list of conditions and the following disclaimer in the documentation
 *    and/or other materials provided with the distribution.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" AND
 * ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED
 * WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE
 * DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT OWNER OR CONTRIBUTORS BE LIABLE FOR
 * ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES
 * (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES;
 * LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND
 * ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT
 * (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS
 * SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 */
package net.runelite.client.plugins.loginscreen;

import net.runelite.client.config.Config;
import net.runelite.client.config.ConfigGroup;
import net.runelite.client.config.ConfigItem;

@ConfigGroup("loginscreen")
public interface LoginScreenConfig extends Config
{
	@ConfigItem(
		keyName = "syncusername",
		name = "Sync username",
		description = "Syncs the username that is currently remembered between computers",
		position = 1
	)
	default boolean syncUsername()
	{
		return true;
	}

	@ConfigItem(
		keyName = "pasteenabled",
		name = "Ctrl-V paste",
		description = "Enables Ctrl+V pasting on the login screen",
		position = 2
	)
	default boolean pasteEnabled()
	{
		return false;
	}

	@ConfigItem(
		keyName = "hideDisconnect",
		name = "Hide 5 min log message",
		description = "Hides the \"You have been disconnected\" message which appears when you get 5 minute logged",
		position = 3
	)
	default boolean hideDisconnected()
	{
		return false;
	}

	@ConfigItem(
		keyName = "username",
		name = "",
		description = "",
		hidden = true
	)
	default String username()
	{
		return "";
	}

	@ConfigItem(
		keyName = "username",
		name = "",
		description = ""
	)
	void username(String key);
}
