import {Outlet} from "react-router";
import Header from "./Header.tsx";

export default function Layout() {
    return (
        <div className='bg-linear-to-t from-indigo-950 via-indigo-900 to-indigo-950 flex flex-col w-screen h-screen'>
            <Header/>
            <main>
                <Outlet/>
            </main>
        </div>
    );
}