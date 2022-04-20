import React, { useCallback, useEffect, useMemo, useState } from "react";
import { Button, ButtonType } from "./Button";

interface FormElements extends HTMLFormControlsCollection {
    username: HTMLInputElement;
    password: HTMLInputElement;
}

interface LoginFormElement extends HTMLFormElement {
    readonly elements: FormElements
}

interface LoginProps {
    type: ButtonType;
}

export function Login(props: LoginProps & React.HTMLProps<HTMLButtonElement>) {
    const [username, setUsername] = useState("");
    const [password, setPassword] = useState("");
    const [welcomeText, setWelcomeText] = useState("");
    const [counter, setCounter] = useState(0);

    const increaseCounter = useCallback(function () {
        // event?.preventDefault();
        setCounter(counter => counter + 1)
    }, []);

    async function onSubmit(event: React.FormEvent<LoginFormElement>) {
        event.preventDefault();
        // console.log(event.currentTarget);
        console.log(username, password);
        try {
            const response = await fetch("https://test2.free.beeceptor.com/action", { method: "POST", body: JSON.stringify({ username, password }) })
            const result = await response.text();
            console.log(result);
        } catch (error) {
            console.log(error);
        }

        // .then(data => data.text())
        // .then(result => console.log(result));
        // setUsername(event.currentTarget.elements.username.value);
    }

    async function fetchWelcomeText() {
        // const response = await fetch('https://6fe8b1b5-8c26-423a-b936-6d21e17891e3.mock.pstmn.io/welcome');
        const response = await fetch('https://baconipsum.com/api/?type=meat-and-filler');
        const text = await response.json();
        console.log(text[0]);
        setWelcomeText(text[0]);
    }

    useEffect(() => {
        fetchWelcomeText();
    }, [])

    // const btn = useMemo(() => <Button type={props.type} >submit</Button>, [props.type]);

    console.log("login function")
    return (
        <div>
            <div>{welcomeText}</div>
            <form onSubmit={onSubmit}>
                <input placeholder="username" type="text" onChange={(event) => setUsername(event.target.value)}></input>
                <input placeholder="password" type="password" onChange={(event) => setPassword(event.target.value)}></input>
                {/* {btn} */}
                <Button type={ButtonType.primary} >submit</Button>
            </form>
            <div>Count: {counter}</div>
            <Button type={ButtonType.secondary} onClick={increaseCounter}>Increase Counter</Button>
        </div>
    )
}