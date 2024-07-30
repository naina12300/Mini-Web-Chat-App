import { ChatEngine } from "react-chat-engine";
import './App.css';

import ChatFeed from "./components/ChatFeed";
import LoginForm from "./components/LoginForm"


const App = () =>{
   if(!localStorage.getItem("username")) return <LoginForm/>
    return (
        <ChatEngine
              height="100vh"
              projectID="8625f0b2-4f2d-46e0-bb76-8037cf87c760"
              userName={localStorage.getItem('username')}
              userSecret={localStorage.getItem("password")}
              renderChatFeed={(chatAppProps) => <ChatFeed {...chatAppProps}/>} 
        />

    );
}

export default App;