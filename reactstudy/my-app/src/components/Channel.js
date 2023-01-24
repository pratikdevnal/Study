import React from "react";
class Channel extends React.Component{
    constructor()
    {
        super();
        this.state={
            msg:'technical Suneja youtube channel'
        }
    }
    subscribe(){
        this.setState({
            msg:"thanks for subscribing"
        })
    }
    unsubscribe(){
        this.setState({
            msg:"please subscribe"
        })
    }
    render()
    {
        return(

        <div>
        <h1>{this.state.msg}</h1>
        <button onClick={()=>{this.subscribe()}}>Subscribe</button>
        <button onClick={()=>{this.unsubscribe()}}>unSubscribe</button>
        </div>
            
        )
    }
}
export default Channel;