/*
 * Copyright 2016 SerNet Service Network GmbH.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package de.sernet.fluke.client.rest.test;

import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import de.sernet.fluke.client.rest.GameResult;
import de.sernet.fluke.client.rest.GameResultRestClient;
import de.sernet.fluke.interfaces.IGameResult;

/**
 * @author Sebastian Hagedorn <sh[at]sernet[dot]de>
 */
public class GameResultRestClientTest {
    
    @Autowired 
    GameResultRestClient gameResultRestClient;
    
    @Before
    public void init() {
        gameResultRestClient.setServerUrl("http://localhost:8080/service/");
        gameResultRestClient.setPath("gameResult");
    }
    
    @Test
    public void test() {
        IGameResult gameResult = new GameResult((short)6, (short)6);
        gameResult = gameResultRestClient.save(gameResult);
        
    }

}
